# Keycloak Test API

POC pour tester la délégation d'authentité d'API via Keycloak.
Ce projet utilise le docker compose de hex46/Docker-Keycloak-Pgadmin-App.

## Quelques infos 

Ce projet est basé sur [cet article sur Medium](https://medium.com/devops-dudes/securing-spring-boot-rest-apis-with-keycloak-1d760b2004e).

## Quelques commandes

```bash
# Récupérer un token pour un utilisateur donné
curl -X POST 'http://localhost:8082/auth/realms/Keycloaktestapi-Realm/protocol/openid-connect/token' \
 --header 'Content-Type: application/x-www-form-urlencoded' \
 --data-urlencode 'grant_type=password' \
 --data-urlencode 'client_id=keycloaktestapi-login' \
 --data-urlencode 'client_secret=XXXX-XXXX-XXXX-XXXX' \
 --data-urlencode 'username=admin' \
 --data-urlencode 'password=admin'

# Exemples de requetes
curl -X GET 'http://localhost:8080/' \
--header 'Authorization: bearer <TOKEN>'

curl -X GET 'http://localhost:8080/admin/' \
--header 'Authorization: bearer <TOKEN>'

curl -X GET 'http://localhost:8080/movies/' \
--header 'Authorization: bearer <TOKEN>'

```

## TODO
- Réaliser l'authentification via l'API et non via Keycloak directement