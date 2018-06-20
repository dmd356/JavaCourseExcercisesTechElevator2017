-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
--    Rows: 30
select film.title from actor 
join film_actor on actor.actor_id = film_actor.actor_id
join film on film.film_id = film_actor.film_id
where actor.first_name = 'NICK' and actor.last_name = 'STALLONE'

-- 2. All of the films that Rita Reynolds has appeared in
--    Rows: 20

select film.title from actor 
join film_actor on actor.actor_id = film_actor.actor_id
join film on film.film_id = film_actor.film_id
where actor.first_name = 'RITA' and actor.last_name = 'REYNOLDS'

-- 3. All of the films that Judy Dean or River Dean have appeared in
--    Rows: 46

select film.title from actor 
join film_actor on actor.actor_id = film_actor.actor_id
join film on film.film_id = film_actor.film_id
where actor.first_name = 'JUDY' and actor.last_name = 'DEAN'  or actor.first_name = 'RIVER' and actor.last_name = 'DEAN'


-- 4. All of the the ‘Documentary’ films
--    Rows: 68

select film.title  from film 
join film_category on film_category.film_id = film.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Documentary';

-- 5. All of the ‘Comedy’ films
--    Rows: 58
select film.title  from film 
join film_category on film_category.film_id = film.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
--    Rows: 10 
select film.title  from film 
join film_category on film_category.film_id = film.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Children' and film.rating = 'G'

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
--    Rows: 3
select film.length, film.title  from film 
join film_category on film_category.film_id = film.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Family' and film.rating = 'G' and film.length < 120

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
--    Rows: 9
select film.title from actor 
join film_actor on actor.actor_id = film_actor.actor_id
join film on film.film_id = film_actor.film_id
where actor.first_name = 'MATTHEW' and actor.last_name = 'LEIGH' and film.rating = 'G'

-- 9. All of the ‘Sci-Fi’ films released in 2006
--    Rows: 61
select film.length, film.title  from film 
join film_category on film_category.film_id = film.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Sci-Fi' 

-- 10. All of the ‘Action’ films starring Nick Stallone
--     Rows: 2

select film.title from category 
join film_category on category.category_id = film_category.category_id
join film on film_category.film_id = film.film_id
join film_actor on film.film_id = film_actor.film_id
join actor on film_actor.actor_id = actor.actor_id
where actor.first_name = 'NICK' and actor.last_name = 'STALLONE' and category.name = 'Action'

-- 11. The address of all stores, including street address, city, district, and country
--     Rows: 2
Select address.address, address.district, city.city, country.country  from address
join city on address.city_id = city.city_id
join country on city.country_id = country.country_id


-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
--     Rows: 2
Select store.store_id, staff.first_name,staff.last_name, address.address from store
join address on store.address_id = address.address_id
join staff on store.manager_staff_id = staff.staff_id






-- 13. The first and last name of the top ten customers ranked by number of rentals 
--     Hint: #1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals
Select first_name, last_name, count(rental.return_date) from customer
join rental on customer.customer_id = rental.customer_id
group by first_name, last_name


select inventory_id from rental
select amount from payment

-- 14. The first and last name of the top ten customers ranked by dollars spent 
--     Hint: #1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent



Select first_name, last_name, sum(payment.amount) from customer
JOIN payment ON customer.customer_id = payment.customer_id
join rental on customer.customer_id = rental.customer_id
group by first_name, last_name




-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
--     Hint: Store 1 has 7928 total rentals and Store 2 has 8121 total rentals

Select address.address, count(rental.return_date), sum(payment.amount) from store
join address on store.address_id = address.address_id
join customer on payment.customer_id = customer.customer_id
JOIN payment ON customer.customer_id = payment.customer_id
join rental on payment.rental_id = rental.rental_id
group by address.address




-- 16. The top ten film titles by number of rentals 
--     Hint: #1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals
Select film.title, count(rental.return_date) from rental
join inventory on rental.inventory_id = inventory.inventory_id
join film on inventory.film_id = film.film_id
group by film.title




-- 17. The top five film categories by number of rentals 
--     Hint: #1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals
Select category.name, count(rental.return_date) from rental
join inventory on rental.inventory_id = inventory.inventory_id
join film on inventory.film_id = film.film_id
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
group by category.name

-- 18. The top five Action film titles by number of rentals 
--     Hint: #1 should have 30 rentals and #5 should have 28 rentals
Select film.title, count(rental.return_date) from rental
join inventory on rental.inventory_id = inventory.inventory_id
join film on inventory.film_id = film.film_id
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Action'
group by film.title


-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
--     Hint: #1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals

Select actor.first_name, actor.last_name, count(rental.return_date) from rental
join inventory on rental.inventory_id = inventory.inventory_id
join film on inventory.film_id = film.film_id
join film_actor on film.film_id = film_actor.film_id
join actor on film_actor.actor_id = actor.actor_id
group by actor.first_name, actor.last_name

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
--     Hint: #1 should have 87 rentals and #5 should have 72 rentals

Select actor.first_name, actor.last_name, category.name, count(rental.return_date) from rental
join inventory on rental.inventory_id = inventory.inventory_id
join film on inventory.film_id = film.film_id
join film_actor on film.film_id = film_actor.film_id
join actor on film_actor.actor_id = actor.actor_id
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Comedy'
group by actor.first_name, actor.last_name, category.name
