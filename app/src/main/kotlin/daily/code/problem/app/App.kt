/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package daily.code.problem.app

import daily.code.problem.utilities.StringUtils

import org.apache.commons.text.WordUtils

fun main() {
    val tokens = StringUtils.split(MessageUtils.getMessage())
    val result = StringUtils.join(tokens)
    println(WordUtils.capitalize(result))
}
