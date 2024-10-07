# Documentation for Running Services

## Steps to Run Microservices

```sh
# Step 1: Clone all folders of the services separately from the repository
git clone <repository_url> service-discovery
git clone <repository_url> service-a
git clone <repository_url> service-b
```

```sh
# Step 2: Start the services in the following order:
# First: Start Discovery Service
cd service-discovery
./gradlew bootRun

# Second: Start Service A
cd ../service-a
./gradlew bootRun

# Third: Start Service B
cd ../service-b
./gradlew bootRun
```

## Overview

This documentation shows how to set up and launch the services, and illustrates their interaction with each other.

### Launch Order
1. **Discovery Service** - This service must be launched first, as it is responsible for discovering and connecting all other services.
2. **Service A** and **Service B** - After the Discovery Service is up and running, proceed with launching these services.

Each of the services is configured to register with the Discovery Service, enabling seamless communication between them. Below, you will find the configuration guidelines for setting up each service.

---

# Документация для запуска сервисов

## Шаги для запуска микросервисов

```sh
# Шаг 1: Клонируйте все папки с сервисами отдельно из репозитория
git clone <repository_url> service-discovery
git clone <repository_url> service-a
git clone <repository_url> service-b
```

```sh
# Шаг 2: Запустите сервисы в следующем порядке:
# Сначала: Запустите Discovery Service
cd service-discovery
./gradlew bootRun

# Затем: Запустите Service A
cd ../service-a
./gradlew bootRun

# Затем: Запустите Service B
cd ../service-b
./gradlew bootRun
```

## Обзор

Эта документация показывает, как настроить и запустить сервисы, а также иллюстрирует их взаимодействие между собой.

### Порядок запуска
1. **Discovery Service** - Этот сервис необходимо запускать первым, так как он отвечает за обнаружение и подключение всех других сервисов.
2. **Service A** и **Service B** - После того, как Discovery Service запущен, продолжайте с запуском этих сервисов.

Каждый из сервисов настроен на регистрацию в Discovery Service, что позволяет им беспрепятственно взаимодействовать между собой. Ниже приведены рекомендации по настройке каждого сервиса.
