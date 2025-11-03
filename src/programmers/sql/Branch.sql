package programmers.sql

select
    e1.id
    e1.name,
    e1.branch_id,
    (count(e2.id) - 1) as colleague_count
from
    employees e1
join
    employees e2
on
    e1.branch_id = e2.branch_id
group by
    e1.id, e1.name, e1.id, e1.branch_id
order by
    e1.id;