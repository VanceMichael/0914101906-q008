# 跨区漂流停航协调中心

这是一个 Java 纯后端服务，水情事件、线路状态和待通知事项保存在本地 SQLite，默认 `rafting-coordination.db`，可通过 `RAFTING_DB_PATH` 调整。

迁移：`./mvnw flyway:migrate`。启动：`./mvnw spring-boot:run`，健康检查为 `/health`。测试：`./mvnw test`。容器运行：`docker build -t rafting-coordination . && docker run --rm -p 8080:8080 rafting-coordination`。
