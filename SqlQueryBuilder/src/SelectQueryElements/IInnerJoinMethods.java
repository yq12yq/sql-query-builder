package SelectQueryElements;

public interface IInnerJoinMethods {

    /**
     * Make inner join with given table and clause
     * @param table
     * @param clause
     * @return
     */
    IJoinQuery innerJoin(String table, String clause);

    /**
     * Make inner join with given table and default equality clause
     * @param table
     * @param leftId
     * @param rightId
     * @return
     */
    IJoinQuery innerJoin(String table, String leftId, String rightId);

    /**
     * Make inner join with given table, default equality clause and other complementary clause
     * @param table
     * @param leftId
     * @param rightId
     * @param otherClauses
     * @return
     */
    IJoinQuery innerJoin(String table, String leftId, String rightId, String otherClauses);

}