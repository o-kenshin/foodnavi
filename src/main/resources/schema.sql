CREATE TABLE IF NOT EXISTS shoplist(
    storeId LONG PRIMARY,
    name VARCHAR(20) NOT NULL,
    addres  VARCHAR(256) NOT NULL,
    category VARCHAR(10) NOT NULL,
    openhour VARCHAR(256) NOT NULL,
    introduce VARCHAR(256) NOT NULL
);