# app-backend-food

Food microservice for **Neuland Backend 2.0** — scraping, normalization, caching.

## Role

- Food REST API (`GET /food`)
- Scraping pipeline: Mensa XML, Reimanns, Canisius
- Optional DeepL translation
- Valkey cache per restaurant location

## Related repos

- [app-backend-contracts](https://github.com/neuland-ingolstadt/app-backend-contracts) — OpenAPI specs
- [app-backend-core](https://github.com/neuland-ingolstadt/app-backend-core) — proxies food requests from Public API
- [app-backend-cloud-gateway](https://github.com/neuland-ingolstadt/app-backend-cloud-gateway) — external entry point
- [neuland.app-backend](https://github.com/neuland-ingolstadt/neuland.app-backend) — legacy GraphQL backend (to be retired)

## Modules

This is a multi-module Maven (hexagonal architecture) project:

- `food-service-domain` — framework-free core entities/value objects
- `food-service-application` — inbound/outbound ports and use cases
- `food-service-adapters-inbound-rest` — JAX-RS REST resources
- `food-service-adapters-outbound-persistence` — persistence adapter
- `food-service-bootstrap` — Quarkus application wiring all modules together

## Build & Run

The Maven Wrapper lives at the repo root and always builds the full reactor. Run all commands from here, not from inside a module folder.

Build and test everything:

```shell script
./mvnw verify
```

Run the bootstrap application in dev mode:

```shell script
./mvnw quarkus:dev -pl food-service-bootstrap
```

Package the runnable application:

```shell script
./mvnw package -pl food-service-bootstrap -am
```

The `-pl` flag targets the bootstrap module specifically, and `-am` ("also make") builds the modules it depends on first.
