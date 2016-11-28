cf create-service p-mysql 100mb-dev trader-db
cf create-service p-service-registry standard trader-registry
cf create-service p-config-server standard config-server -c "{\"git\": { \"uri\": \"https://github.com/rossr3-pivotal/trader-config-repo.git\" } }"
cf create-service p-circuit-breaker-dashboard standard trader-dashboard
