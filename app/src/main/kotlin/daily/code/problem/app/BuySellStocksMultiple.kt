package daily.code.problem.app

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
class BuySellStocksMultiple {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0;
        val dd = "ffff"
        dd.toCharArray()[0].isLetter()
        for (i in 0 until prices.size - 1){
            if (prices[i + 1] > prices[i]){
                profit += (prices[i + 1] - prices[i])
            }
        }
        return profit
    }
}