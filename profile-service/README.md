# Profile Service


-------------------------------------------------------
## Prepare the database
`docker run --name bookteria-neo4j --publish=7474:7474 --publish=7687:7687 -e 'NEO4J_AUTH=neo4j/root1234' -d neo4j:latest`