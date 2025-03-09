SELECT  GB.WRITER_ID AS USER_ID,
        GU.NICKNAME,
        SUM(GB.PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD GB
    LEFT JOIN USED_GOODS_USER GU
    ON GB.WRITER_ID = GU.USER_ID
WHERE GB.STATUS = 'DONE'
GROUP BY GB.WRITER_ID, GU.NICKNAME
HAVING SUM(GB.PRICE) >= 700000
ORDER BY TOTAL_SALES ASC;