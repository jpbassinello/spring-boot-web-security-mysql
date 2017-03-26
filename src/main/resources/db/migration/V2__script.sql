create table `user` (
       `id` bigint not null auto_increment,
        `birthday` date not null,
        `email` varchar(255) not null,
        `name` varchar(255) not null,
        `password` varchar(255) not null,
        primary key (`id`)
    );

insert into `user` (birthday, email, name, password)
values ('1985-04-10', 'jp@email.com', 'João Paulo Bassinello', md5('123456'));