insert into Room (id,name,location,amenities,capacity,description)
values(1,'Room one','First floor','TV, Projector',9,'Large Room with TV Projector');

insert into Room (id,name,location,amenities,capacity,description)
values(2,'Room Two','Second floor','Mac, Projector,Phone',4,'Medium room with phone');

insert into Room (id,name,location,amenities,capacity,description)
values(3,'Room Three','Third floor','White-board, PC,Phone',6,'Presentation room with PC');

insert into Room (id,name,location,amenities,capacity,description)
values(4,'Room Four','Fourth floor','PC,Phone',2,'One on One room');

insert into Reservation (id,from_Time_Stamp,to_Time_Stamp,room_id)
values(1,parsedatetime('22-10-2018 14:00:00.000 EDT', 'dd-MM-yyyy hh:mm:ss.SS z'),parsedatetime('22-10-2018 15:00:00.000 EDT', 'dd-MM-yyyy hh:mm:ss.SS z'),1);

insert into Reservation (id,from_Time_Stamp,to_Time_Stamp,room_id)
values(2,parsedatetime('22-10-2018 08:00:00.000 EDT', 'dd-MM-yyyy hh:mm:ss.SS z'),parsedatetime('22-10-2018 09:00:00.000 EDT', 'dd-MM-yyyy hh:mm:ss.SS z'),2);

insert into user(user_id,user_name,first_name,last_name,email,password)
values(1,'ravi','ravi','cha','ravi@cmail.com','pass');

insert into user(user_id,user_name,first_name,last_name,email,password)
values(2,'admin','admin','admin','admin@cmail.com','admin');

insert into role(role_id,role)
values(1,'USER');

insert into role(role_id,role)
values(2,'ADMIN');

insert into user_role(user_id,role_id)
values(1,1);

insert into user_role(user_id,role_id)
values(2,2);