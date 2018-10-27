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