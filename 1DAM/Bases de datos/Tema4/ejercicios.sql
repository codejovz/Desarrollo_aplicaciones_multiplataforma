# Ejer 6 de J.V.Z.
use employees;
select Gender, count(*)
from employees
group by Gender
order by 2 desc;

# Ejer 7 de J.V.Z.
use sakila;
select count(*)
from rental
where customer_id = 155
and return_date is null;

# Ejer 8 de J.V.Z.
use sakila;
select rating, special_features, COUNT(*) as count
  from film
 where title like 'Tr%'
group by rating, special_features
order by rating asc, special_features asc, count desc;

# Ejer 10 de J.V.Z.
use employees;
select firt_name, last_name, count(*)
  from employees
  group by first_name, last_name
  having count(*) > 4;

# Ejer 11 de J.V.Z.
use employees;
select a.first_name Nombre,
       a.last_name Apellido
       a.gender Genero,
       if(c.dept_name, 'Sales', 'Ventas') Departamento
  from employees a
  join dept_emp b on a.emp_no = b.emp_no
  join departments c on b.dept_no = c.dept_no
where c.dept_name = 'Sales'
and a.first_name like 'Ma%'
and a.last_name like 'San%'
order by 2, 1, 3;

# Ejer 12 de J.V.Z.
use employees;
select a.first_name Nombre,
       a.last_name Apellido,
       a.gender
        if(c.dept_name, 'Finance', 'Finanzas') Departamento
  from employees a, dept_emp b, departments c
  where a.emp_no = b.emp_no
    and b.dept_no = c.dept_no
    and c.dept_name = 'Finance'
    and a.first_name != 'M%'
    and a.last_name like 'Jon%'
order by 2, 1, 3;

# Ejer 12bis
use employees;
select a.first_name Nombre,
       a.last_name Apellido,
       a.gender Genero,
        if(c.dept_name, 'Finance', 'Finanzas') Departamento
  from employees a, dept_emp b, departments c
  where a.emp_no = b.emp_no
    and b.dept_no = c.dept_no
    and c.dept_name = 'Finance'
    and a.first_name not like 'M%'
    and a.last_name like 'Jon%'
order by 2, 1, 3;


# Ejer 13 de J.V.Z.
use employees;
select e.first_name, e.last_name, s.salary
  from employees e
  join salaries s on e.emp_no = s.emp_no
 where s.salary = (select max(salary) from salaries);


# Ejer 14 de J.V.Z.
use employees;
select d.dept_no as nombre_departamento, e.gender as genero, COUNT(*) as numero_empleados_genero
  from employees e
  join dept_emp de on e.emp_no = de.emp_no
  join departments d on de.dept_no = d.dept_no
 group by d.dept_no, e.gender
  order by d.dept_no asc, e.gender asc;

# Ejer 15 de J.V.Z.
use world;
select Pais.Name as Nombre_Pais, Ciudad.Name as Ciudad
  from country as Pais inner join city as Ciudad
    on Ciudad.Name = Pais.Name # Esto es la join
 where Ciudad.Name like (Pais.Name);

# Ejer 16 de J.V.Z.
use sakila;
select title as Titulo, description as Descripcion
from film
where description like '%MySQL%'
and description like '%Mad Scientists%'
order by title asc;

# Ejer 17 de J.V.Z.
use sakila;
select a.first_name as Nombre, a.last_name as Apellido, p.title as Titulo
  from actor a
  join film_actor pa on a.actor_id = ap.actor_id
  join film p on ap.film_id = p.film_id
 where a.first_name like 'F%'
   and p.description like '%drama%'
   and p.description like '%database administrator%'
 order by p.title asc;







select count(distinct title)
from titles;

desc employees;

select*from departments;

desc dept_emp;

select*from dept_emp;

where dept_no ='d007';


select count(*)
from dept_emp
where dept_no =


select dept_no
from departments
where dept_name='Sales';




select count(*)
  from dept_emp
 where dept_no = (select dept_no
				  from departments
                  where dept_name = 'Sales');
                
                
#Ejercicio 2 con subconsulta

select count(*)
  from current_dept_emp
 where dept_no = (select dept_no
				    from departments
                   where dept_name = 'Sales');
#Ejercicio 4                   
                   
select count(*)    #Ejer 4 de J.V.Z
  from dept_emp, departments
 where dept_emp.dept_no = departments.dept_no #Esto es la JOIN
   and departments.dept_name = 'Sales'; 
   
select count(*)    #Ejer 5 de J.V.Z
  from current_dept_emp, departments
 where current_dept_emp.dept_no = departments.dept_no #Esto es la JOIN
   and departments.dept_name = 'Sales';                 
 
#Ejer 6 de J.V.Z
use employees;
select Gender, count(*)
from employees
group by Gender
order by 2 desc;
                
#En la base de datos sakila realiza una consulta que obtenga en la tabla de películas (film)
# todos los agrupamientos por calificación (rating) y por características especiales (special_features) 
#de las películas cuyo título comience por 'Tr'.



#EJERCICIO 8 de J.V.Z
use sakila;
select rating,special_features
  from film
where title like 'Tr%'
group by rating,special_features
order by rating,special_features;
;
#EJER 8 
   
   
 #EJER 9 de J.V.Z. 

use employees;

drop table empleado;
create table empleado as
(select emp_no DNI, first_name Nombre, last_name Apellido,
		gender Genero, 10000 as DNI_JEFE
        from employees
        order by 1
        limit 1000);
        
        
alter table empleado modify column DNI_JEFE int null;
alter table empleado add primary key(DNI);
update empleado
   set DNI_JEFE = null
   where DNI in (10001, 10501);
update empleado
   set DNI_JEFE = 10001
 where DNI between 10002 and 10500;
update empleado
   set DNI_JEFE = 10501
 where DNI between 10502 and 11000;
 alter table empleado add constraint DNI_JEFE_FK
 foreign key(DNI_JEFE) references empleado(DNI);

#4.
select trabajador.*, jefe.*
from empleado trabajador, empleado jefe
where trabajador.DNI_JEFE = jefe.DNI
and trabajador.DNI in (10002,10500);


select trabajador.*, jefe.*
from empleado trabajador, empleado jefe
where trabajador.DNI_JEFE = jefe.DNI
and trabajador.DNI in (10502,10599);



#EJER 9


#EJER 10 de J.V.Z.
use employees;
select first_name, last_name, count(*)
  from employees
  group by first_name, last_name
  having count(*) > 4;

#EJER 11 de J.V.Z
use employees;
select a.first_name  Nombre,
	   a.last_name Apellido,
	   a.gender Genero,
	   if(c.dept_name, 'Sales', 'Ventas') Departamento
  from employees a
  join dept_emp b on a.emp_no = b.emp_no
  join departments c on b.dept_no = c.dept_no
where c.dept_name = 'Sales' 
and a.first_name like 'Ma%'
and a.last_name like 'San%'
order by 2, 1, 3;


#EJER 12 de J.V.Z 
use employees;
select a.first_name Nombre,
       a.last_name Apellido,
       a.gender Genero,
       if (c.dept_name, 'Finance', 'Finanzas') Departamento
  from employees a, dept_emp b, departments c
 where a.emp_no = b.emp_no
   and b.dept_no = c.dept_no
   and c.dept_name = 'Finance'
   and a.first_name != 'M%'
   and a.last_name like 'Jon%'
 order by 2, 1, 3;


#EJER 13 de J.V.Z
use employees;

select e.first_name, e.last_name, s.salary
  from employees e
  join salaries s on e.emp_no= s.emp_no
 where s.salary = (select max(salary) from salaries);
 


#EJER 14 de J.V.Z 
use employees;
select d.dept_no as nombre_departamento, e.gender as genero, COUNT(*) as numero_empleados_genero
  from employees e
  join dept_emp de on e.emp_no = de.emp_no
  join departments d on de.dept_no = d.dept_no
 group by d.dept_no, e.gender
 order by d.dept_no asc, e.gender asc;
