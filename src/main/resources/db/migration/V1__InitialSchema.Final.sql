CREATE TABLE MASSAPP.PERSON
(
	ID                     	    BIGSERIAL NOT NULL,
	MSISDN					    CHARACTER VARYING(50) NOT NULL UNIQUE,
	EMAIL					    CHARACTER VARYING(100) NOT NULL UNIQUE,
	NAME					    CHARACTER VARYING(50) NOT NULL,
	LAST_NAME					CHARACTER VARYING(50) NOT NULL,
	CREATED_AT				    TIMESTAMP NOT NULL,
	UPDATED_AT				    TIMESTAMP,
	MASSAGE_COUNT				INTEGER  DEFAULT 0,
	CONSTRAINT PERSON_PK PRIMARY KEY ( ID )
);