CREATE FUNCTION `new_function` (num INT)
RETURNS INTEGER
BEGIN

		select id  from orders where customer_id>=10;
		RETURN id;
END




