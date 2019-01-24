  create table expenses(
    num int  AUTO_INCREMENT,
    paydate date,
    receiver int,
    value dec,
    FOREIGN KEY (receiver) REFERENCES receivers (num),
    primary key (num)
  );
  create table receivers(
    num int auto_increment,
    name varchar(255),
    primary key (num)
  );

  insert into receivers (name) values
                                      ('Интернет провайдер "Соло"'),
                                      ('Гипермаркет "Корона"'),
                                      ('МТС');

  insert into expenses (paydate, receiver, value) values
                                                         ('2011-5-10',1,20000.0),
                                                         ('2011-5-10',2,94200.0),
                                                         ('2011-5-11',3,8000.0),
                                                         ('2011-5-11',2,12950.0);

   select num,paydate,value,receiver FROM expenses WHERE value >10000;
   select * FROM expenses WHERE value >10000;

  select e.num,paydate,name,value from expenses as e,receivers as r
  where receiver=r.num;

  delete from expenses where expenses.value<3000;


