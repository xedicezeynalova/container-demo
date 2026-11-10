# Docker və Kubernetes demo

İki Spring Boot servisi: product-service (8081) və order-service (8082).

## Docker Compose ilə işlət
docker compose up --build

## Kubernetes ilə işlət
docker build -t product-service:1.0 ./product-service
docker build -t order-service:1.0 ./order-service
kubectl apply -f k8s/
kubectl port-forward svc/order-service 8082:8082

## Yoxla
Brauzerdə aç: localhost:8082/orders/1