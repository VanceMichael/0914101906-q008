# 跨区漂流停航协调中心

这是一个 Java 纯后端服务，作品来源保存在本地 SQLite，默认 `provenance.db`，可通过 `PROVENANCE_DB_PATH` 调整。

迁移：`./mvnw flyway:migrate`。启动：`./mvnw quarkus:dev`，健康检查为 `/health`。测试：`./mvnw test`。容器运行：`docker build -t provenance-register . && docker run --rm -p 8080:8080 provenance-register`。
