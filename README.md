# dvd-rental

## 📦 PostgreSQL Database Setup

### Switch to PostgreSQL User

```bash
sudo -i -u postgres
```

### Enter PostgreSQL Shell

```bash
psql -d
```

### Create a New Role

```bash
CREATE ROLE srivatsan WITH LOGIN SUPERUSER PASSWORD 'password';
```

### Create a New Database

```bash
CREATE DATABASE dvdrental;

\q
```

### Restore the Dump

```bash
pg_restore -U srivatsan -d dvdrental dvdrental.tar
```

## Postgres CMD

```bash
psql postgresql://[user]:[password]@[hostname]/[database]
```

```bash
\l show db
\c change db
\d show tables
\q exit psql
\dt show tables
\dt <schema-name>.* -- get all tables from a schema
```