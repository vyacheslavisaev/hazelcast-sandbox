
# Hazelcast

https://docs.hazelcast.com/tutorials/hazelcast-embedded-springboot

## Manual Testing 

Setting key/value
```bash
curl --data "key=key1&value=hazelcast" "localhost:8080/put"
```

Reading
```bash
curl "localhost:8080/get?key=key1"
```

## Metrics

http://localhost:8080/actuator/health

