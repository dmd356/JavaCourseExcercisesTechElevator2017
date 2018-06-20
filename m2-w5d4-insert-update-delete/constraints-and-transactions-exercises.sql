-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

insert into actor (first_name, last_name) values ('HAMPTON', 'AVENUE');	
insert into actor (first_name, last_name) values ('LISA', 'BYWAY');	

BEGIN TRANSACTION;

COMMIT;

select * from actor

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	


insert into film(film_id, title, description, release_year, language_id, original_language_id, rental_duration, rental_rate, length, replacement_cost, rating) values (1001, 'Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in 
ancient Greece', 2008, 1, null, 4, 3.99, 198, 20.99, 'PG-13' );
select * from film
where film_id = 1001

BEGIN TRANSACTION;

COMMIT;

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

r


-- 4. Add Mathmagical to the category table.
insert into category (category_id, name) values (17, 'Mathmagical')

select * from category

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

insert into film_category (category_id, film_id) values(17, 1001)
	
update film_category
SET category_id = 17
where film_id = 1001

update film_category
SET category_id = 17
where film_id = 274

update film_category
SET category_id = 17
where film_id = 494

update film_category
SET category_id = 17
where film_id = 712

update film_category
SET category_id = 17
where film_id = 996


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

update film
SET rating = 'G'
where film_id = 1001

update film
SET rating = 'G'
where film_id = 274

update film
SET rating = 'G'
where film_id = 494

update film
SET rating = 'G'
where film_id = 714

update film
SET rating = 'G'
where film_id = 996

-- 7. Add a copy of "Euclidean PI" to all the stores.

insert into inventory(film_id, store_id) values(1001, 1);
insert into inventory(film_id, store_id) values(1001, 2);


-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? NO Why? BECAUSE IT MESSES WITH CATEGORY PRIMARY KEYS )

delete from film where title = 'Euclidian Pi';

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? NO Why? BECAUSE IT MESSES WITH THE FOREIGN KEY IN FILM_CATEGORY)

begin;
delete from category where name = 'Mathmagical';
commit;

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? YES Why? DOES NOT BREAK ANY LINKS)

delete from film_category where category_id = 17;

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? YES Why? DOES NOT BREAK ANY LINKS)
delete from category where name = 'Mathmagical';

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

delete from inventory where film_id = 1001;
