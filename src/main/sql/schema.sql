use geolocation;

drop table version;

create table version (
	version_no varchar(10),
    creation_date timestamp)
    ;

insert into version values (1.0, NOW());
