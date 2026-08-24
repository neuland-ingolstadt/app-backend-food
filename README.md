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
