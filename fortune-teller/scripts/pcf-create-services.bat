cf cs p-mysql 100mb-dev fortunes-db
cf cs p-config-server standard config-server -c "{\"git\": { \"uri\": \"https://github.com/chjohnson-pivotal/fortune-teller\", \"searchPaths\": \"configuration\" } }"
cf cs p-service-registry standard service-registry
cf cs p-circuit-breaker-dashboard standard circuit-breaker-dashboard
