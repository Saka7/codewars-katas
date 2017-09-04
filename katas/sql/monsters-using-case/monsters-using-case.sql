SELECT
  th.id as id,
  th.heads as heads,
  th.arms as arms,
  bh.legs as legs,
  bh.tails as tails,
  CASE
    WHEN th.heads > th.arms OR bh.tails > bh.legs
      THEN 'BEAST'
      ELSE 'WEIRDO'
  END as species
FROM
  top_half as th
  JOIN bottom_half as bh ON th.id = bh.id
ORDER BY species;