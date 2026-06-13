# neuland.app-food-service

Food microservice for **Neuland Backend 2.0** — scraping, normalization, caching.

## Role

- Food REST API (`GET /food`)
- Scraping pipeline: Mensa XML, Reimanns, Canisius
- Optional DeepL translation
- Valkey cache per restaurant location

## Related repos

- [neuland.app-contracts](https://github.com/neuland-ingolstadt/neuland.app-contracts) — OpenAPI specs
- [neuland.app-core-api](https://github.com/neuland-ingolstadt/neuland.app-core-api) — proxies food requests from Public API
- [neuland.app-cloud-gateway](https://github.com/neuland-ingolstadt/neuland.app-cloud-gateway) — external entry point
- [neuland.app-backend](https://github.com/neuland-ingolstadt/neuland.app-backend) — legacy GraphQL backend (to be retired)
