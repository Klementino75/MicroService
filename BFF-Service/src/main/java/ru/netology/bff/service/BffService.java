package ru.netology.bff.service;

import ru.netology.bff.entity.Order;
import ru.netology.bff.entity.UserData;
import ru.netology.bff.entity.User;

import lombok.RequiredArgsConstructor;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BffService {
    private final WebClient.Builder webClientBuilder;
    @Value("${users-service-uri}")
    private String usersServiceUri;
    @Value("${orders-service-uri}")
    private String ordersServiceUri;

    public Optional<UserData> getUserData(Long userId) {
        try {
            User user = webClientBuilder.build()
                    .get()
                    .uri(usersServiceUri + "/api/users/" + userId)
                    .retrieve()
                    .bodyToMono(User.class)
                    .block();

            List<Order> orders = webClientBuilder.build()
                    .get()
                    .uri(ordersServiceUri + "/api/orders/by-user/" + userId)
                    .retrieve()
                    .bodyToMono(new ParameterizedTypeReference<List<Order>>() {})
                    .block();

            return Optional.of(new UserData(user, orders));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }
}