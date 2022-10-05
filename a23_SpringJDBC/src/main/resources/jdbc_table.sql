CREATE TABLE jdbc_table(
    int_data NUMBER NOT NULL,
    str_data VARCHAR2(500) not null
);

SELECT * FROM jdbc_table;

COMMIT;