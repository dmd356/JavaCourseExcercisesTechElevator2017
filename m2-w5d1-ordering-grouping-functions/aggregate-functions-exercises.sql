-- The following queries utilize the "world" database.
-- Write queries for the following problems. 
-- Notes:
--   GNP is expressed in units of one million US Dollars
--   The value immediately after the problem statement is the expected number 
--   of rows that should be returned by the query.

-- 1. The name and state plus population of all cities in states that border Ohio 
-- (i.e. cities located in Pennsylvania, West Virginia, Kentucky, Indiana, and 
-- Michigan).  
-- The name and state should be returned as a single column called 
-- name_and_state and should contain values such as ‘Detroit, Michigan’.  
-- The results should be ordered alphabetically by state name and then by city 
-- name. 
-- (19 rows)
select CONCAT(name, ', ', district, ', ', population) from city 
where district in('Pennsylvania', 'West Virginia', 'Kentucky', 'Indiana', 'Michigan')

-- 2. The name, country code, and region of all countries in Africa.  The name and
-- country code should be returned as a single column named country_and_code 
-- and should contain values such as ‘Angola (AGO)’ 
-- (58 rows)

Select concat(name, ', (', code, ')') as country_and_code, region from country where continent = 'Africa'

-- 3. The per capita GNP (i.e. GNP divided by population) of all countries in the 
-- world sorted from highest to lowest 
-- (232 rows)

select GNP/population as som from country
where gnp > 0 and gnp > 0
order by som desc


-- 4. The average life expectancy of countries in South America.
-- (average life expectancy in South America: 70.9461)
select region, lifeexpectancy 
from country
where region = 'South America'


-- 5. The sum of the population of all cities in California.
-- (total population of all cities in California: 16716706)

Select population from city where district = 'California'

-- 6. The sum of the population of all cities in China.
-- (total population of all cities in China: 175953614)

Select sum(population) from city where countrycode = 'CHN'


-- 7. The maximum population of all countries in the world.
-- (largest country population in world: 1277558000)
Select population from country where population is not null order by population desc limit 10 


-- 8. The maximum population of all cities in the world.
-- (largest city population in world: 10500000)

Select population from city where population is not null order by population desc limit 1
Select min(population) from country where population > 0



-- 9. The maximum population of all cities in Australia.
-- (largest city population in Australia: 3276207)

Select sum(population) from city where countrycode = 'AUS' WORK ON


-- 10. The minimum population of all countries in the world.
-- (smallest_country_population in world: 50)
Select population from country where population >0 order by population asc limit 1


-- 11. The average population of cities in the United States.
-- (avgerage city population in USA: 286955.3795)
Select avg(population) from city where countrycode = 'USA' 

-- 12. The average population of cities in China.
-- (average city population in China: 484720.6997 approx.)
Select avg(population) from city where countrycode = 'CHN'


-- 13. The surface area of each continent ordered from highest to lowest.
-- (largest continental surface area: 31881000, "Asia")

Select continent, SUM(surfacearea) from country
group by continent 
order by SUM(surfacearea) asc
limit 10


-- 14. The highest population density (surface area divided by population) of all 
-- countries in the world. 
-- (highest population density in world: 38.6801)
Select surfacearea/population as density from country
where population > 0
order by surfacearea/population desc
limit 10

-- 15. The population density and life expectancy of the top ten countries with the 
-- highest life expectancies in descending order. 
-- (highest life expectancies in world: 83.5, 0.006, "Andorra")
Select *, surfacearea/population as density, lifeexpectancy from country
where population > 0 and lifeexpectancy is not null
order by lifeexpectancy desc
limit 10


-- 16. The difference between the previous and current GNP of all the countries in 
-- the world ordered by the absolute value of the difference. Display both 
-- difference and absolute difference.
-- (smallest difference: 1.00, 1.00, "Ecuador")

Select *, concat('absolute: ', abs(gnp - gnpold), ' original: ', gnp - gnpold) as midas from country
where gnp is not null and gnpold is not null
order by midas desc



-- 17. The average population of cities in each country (hint: use city.countrycode)
-- ordered from highest to lowest.
-- (highest avg population: 4017733.0000, "SGP")
SELECT  countrycode, avg(population) FROM city GROUP BY countrycode;


	
-- 18. The count of cities in each state in the USA, ordered by state name.
-- (45 rows)
doesnt work 

-SELECT *, avg(population) as frank FROM city
-where  population > 0
-order by frank desc
-- 19. The count of countries on each continent, ordered from highest to lowest.
-- (highest count: 58, "Africa")


	
-- 20. The count of cities in each country ordered from highest to lowest.
-- (largest number of  cities ib a country: 363, "CHN")
SELECT countrycode, count(countrycode) FROM city GROUP BY countrycode 
	
-- 21. The population of the largest city in each country ordered from highest to 
-- lowest.
-- (largest city population in world: 10500000, "IND")
SELECT code, population FROM country GROUP BY code, population



-- 22. The average, minimum, and maximum non-null life expectancy of each continent 
-- ordered from lowest to highest average life expectancy. 
-- (lowest average life expectancy: 52.5719, 37.2, 76.8, "Africa")



























