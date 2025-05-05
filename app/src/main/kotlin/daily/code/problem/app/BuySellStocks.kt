package daily.code.problem.app

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class BuySellStocks {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0

        for (price in prices) {
            if (price < minPrice) {
                minPrice = price // found a lower buying price
            } else {
                val profit = price - minPrice
                if (profit > maxProfit) {
                    maxProfit = profit // found a better profit
                }
            }
        }

        return maxProfit
    }
}