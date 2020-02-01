package com.binart.binartutils.utils;

import com.binart.binartutils.utils.StringUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2019/9/16.
 */

public class StringUtilTest {

    @Test
    public void isEmpty() throws Exception {
        String name = "lisi";
        boolean flag = StringUtil.isEmpty(name);
        Assert.assertFalse(flag);
    }

    @Test
    public void isNotEmpty() throws Exception {
        String name = "lisi";
        boolean flag = StringUtil.isNotEmpty(name);
        Assert.assertTrue(flag);
    }

    @Test
    public void isBlank() throws Exception {

    }

    @Test
    public void isNotBlank() throws Exception {
    }

    @Test
    public void trim() throws Exception {
    }

    @Test
    public void trimToNull() throws Exception {
    }

    @Test
    public void trimToEmpty() throws Exception {
    }

    @Test
    public void strip() throws Exception {
    }

    @Test
    public void stripToNull() throws Exception {
    }

    @Test
    public void stripToEmpty() throws Exception {
    }

    @Test
    public void strip1() throws Exception {
    }

    @Test
    public void stripStart() throws Exception {
    }

    @Test
    public void stripEnd() throws Exception {
    }

    @Test
    public void stripAll() throws Exception {
    }

    @Test
    public void stripAll1() throws Exception {
    }

    @Test
    public void stripAccents() throws Exception {
    }

    @Test
    public void equals() throws Exception {
    }

    @Test
    public void equalsIgnoreCase() throws Exception {
    }

    @Test
    public void regionMatches() throws Exception {
    }

    @Test
    public void indexOf() throws Exception {
    }

    @Test
    public void indexOf1() throws Exception {
    }

    @Test
    public void indexOf2() throws Exception {
    }

    @Test
    public void indexOf3() throws Exception {
    }

    @Test
    public void ordinalIndexOf() throws Exception {
    }

    @Test
    public void indexOfIgnoreCase() throws Exception {
    }

    @Test
    public void indexOfIgnoreCase1() throws Exception {
    }

    @Test
    public void lastIndexOf() throws Exception {
    }

    @Test
    public void lastIndexOf1() throws Exception {
    }

    @Test
    public void lastIndexOf2() throws Exception {
    }

    @Test
    public void lastOrdinalIndexOf() throws Exception {
    }

    @Test
    public void lastIndexOf3() throws Exception {
    }

    @Test
    public void lastIndexOfIgnoreCase() throws Exception {
    }

    @Test
    public void lastIndexOfIgnoreCase1() throws Exception {
    }

    @Test
    public void contains() throws Exception {
    }

    @Test
    public void contains1() throws Exception {
    }

    @Test
    public void containsIgnoreCase() throws Exception {
    }

    @Test
    public void containsWhitespace() throws Exception {
    }

    @Test
    public void indexOfAny() throws Exception {
    }

    @Test
    public void indexOfAny1() throws Exception {
    }

    @Test
    public void containsAny() throws Exception {
    }

    @Test
    public void containsAny1() throws Exception {
    }

    @Test
    public void indexOfAnyBut() throws Exception {
    }

    @Test
    public void indexOfAnyBut1() throws Exception {
    }

    @Test
    public void containsOnly() throws Exception {
    }

    @Test
    public void containsOnly1() throws Exception {
    }

    @Test
    public void containsNone() throws Exception {
    }

    @Test
    public void containsNone1() throws Exception {
    }

    @Test
    public void indexOfAny2() throws Exception {
    }

    @Test
    public void lastIndexOfAny() throws Exception {
    }

    @Test
    public void substring() throws Exception {
    }

    @Test
    public void substring1() throws Exception {
    }

    @Test
    public void left() throws Exception {
    }

    @Test
    public void right() throws Exception {
    }

    @Test
    public void mid() throws Exception {
    }

    @Test
    public void substringBefore() throws Exception {
    }

    @Test
    public void substringAfter() throws Exception {
    }

    @Test
    public void substringBeforeLast() throws Exception {
    }

    @Test
    public void substringAfterLast() throws Exception {
    }

    @Test
    public void substringBetween() throws Exception {
    }

    @Test
    public void substringBetween1() throws Exception {
    }

    @Test
    public void split() throws Exception {
    }

    @Test
    public void split1() throws Exception {
    }

    @Test
    public void split2() throws Exception {
    }

    @Test
    public void split3() throws Exception {
    }

    @Test
    public void splitByWholeSeparator() throws Exception {
    }

    @Test
    public void splitByWholeSeparator1() throws Exception {
    }

    @Test
    public void splitByWholeSeparatorPreserveAllTokens() throws Exception {
    }

    @Test
    public void splitByWholeSeparatorPreserveAllTokens1() throws Exception {
    }

    @Test
    public void splitPreserveAllTokens() throws Exception {
    }

    @Test
    public void splitPreserveAllTokens1() throws Exception {
    }

    @Test
    public void splitPreserveAllTokens2() throws Exception {
    }

    @Test
    public void splitPreserveAllTokens3() throws Exception {
    }

    @Test
    public void splitByCharacterType() throws Exception {
    }

    @Test
    public void splitByCharacterTypeCamelCase() throws Exception {
    }

    @Test
    public void join() throws Exception {
    }

    @Test
    public void join1() throws Exception {
    }

    @Test
    public void join2() throws Exception {
    }

    @Test
    public void join3() throws Exception {
    }

    @Test
    public void join4() throws Exception {
    }

    @Test
    public void join5() throws Exception {
    }

    @Test
    public void join6() throws Exception {
    }

    @Test
    public void join7() throws Exception {
    }

    @Test
    public void join8() throws Exception {
    }

    @Test
    public void deleteWhitespace() throws Exception {
    }

    @Test
    public void removeStart() throws Exception {
    }

    @Test
    public void removeStartIgnoreCase() throws Exception {
    }

    @Test
    public void removeEnd() throws Exception {
    }

    @Test
    public void removeEndIgnoreCase() throws Exception {
    }

    @Test
    public void remove() throws Exception {
    }

    @Test
    public void remove1() throws Exception {
    }

    @Test
    public void replaceOnce() throws Exception {
    }

    @Test
    public void replace() throws Exception {
    }

    @Test
    public void replace1() throws Exception {
    }

    @Test
    public void replaceEach() throws Exception {
    }

    @Test
    public void replaceEachRepeatedly() throws Exception {
    }

    @Test
    public void replaceChars() throws Exception {
    }

    @Test
    public void replaceChars1() throws Exception {
    }

    @Test
    public void overlay() throws Exception {
    }

    @Test
    public void chomp() throws Exception {
    }

    @Test
    public void chomp1() throws Exception {
    }

    @Test
    public void chop() throws Exception {
    }

    @Test
    public void repeat() throws Exception {
    }

    @Test
    public void repeat1() throws Exception {
    }

    @Test
    public void repeat2() throws Exception {
    }

    @Test
    public void rightPad() throws Exception {
    }

    @Test
    public void rightPad1() throws Exception {
    }

    @Test
    public void rightPad2() throws Exception {
    }

    @Test
    public void leftPad() throws Exception {
    }

    @Test
    public void leftPad1() throws Exception {
    }

    @Test
    public void leftPad2() throws Exception {
    }

    @Test
    public void length() throws Exception {
    }

    @Test
    public void center() throws Exception {
    }

    @Test
    public void center1() throws Exception {
    }

    @Test
    public void center2() throws Exception {
    }

    @Test
    public void upperCase() throws Exception {
    }

    @Test
    public void upperCase1() throws Exception {
    }

    @Test
    public void lowerCase() throws Exception {
    }

    @Test
    public void lowerCase1() throws Exception {
    }

    @Test
    public void capitalize() throws Exception {
    }

    @Test
    public void uncapitalize() throws Exception {
    }

    @Test
    public void swapCase() throws Exception {
    }

    @Test
    public void countMatches() throws Exception {
    }

    @Test
    public void isAlpha() throws Exception {
    }

    @Test
    public void isAlphaSpace() throws Exception {
    }

    @Test
    public void isAlphanumeric() throws Exception {
    }

    @Test
    public void isAlphanumericSpace() throws Exception {
    }

    @Test
    public void isNumeric() throws Exception {
    }

    @Test
    public void isNumericSpace() throws Exception {
    }

    @Test
    public void isWhitespace() throws Exception {
    }

    @Test
    public void isAllLowerCase() throws Exception {
    }

    @Test
    public void isAllUpperCase() throws Exception {
    }

    @Test
    public void defaultString() throws Exception {
    }

    @Test
    public void defaultString1() throws Exception {
    }

    @Test
    public void defaultIfBlank() throws Exception {
    }

    @Test
    public void defaultIfEmpty() throws Exception {
    }

    @Test
    public void reverse() throws Exception {
    }

    @Test
    public void abbreviate() throws Exception {
    }

    @Test
    public void abbreviate1() throws Exception {
    }

    @Test
    public void abbreviateMiddle() throws Exception {
    }

    @Test
    public void difference() throws Exception {
    }

    @Test
    public void indexOfDifference() throws Exception {
    }

    @Test
    public void indexOfDifference1() throws Exception {
    }

    @Test
    public void getCommonPrefix() throws Exception {
    }

    @Test
    public void getLevenshteinDistance() throws Exception {
    }

    @Test
    public void getLevenshteinDistance1() throws Exception {
    }

    @Test
    public void startsWith() throws Exception {
        Assert.assertTrue(StringUtil.startsWith("abvfggr", "abvf"));
    }

    @Test
    public void startsWithIgnoreCase() throws Exception {
        Assert.assertTrue(StringUtil.startsWithIgnoreCase("aBvfggr", "abvf"));
    }

    @Test
    public void startsWithAny() throws Exception {
        Assert.assertTrue(StringUtil.startsWithAny("abcvde", "da", "abc", "ee"));
    }

    @Test
    public void endsWith() throws Exception {
        Assert.assertTrue(StringUtil.endsWith("dadwe", "we"));
    }

    @Test
    public void endsWithIgnoreCase() throws Exception {
        Assert.assertTrue(StringUtil.endsWithIgnoreCase("dadWe", "we"));
    }

    @Test
    public void normalizeSpace() throws Exception {
        Assert.assertEquals("rohte t tri a", StringUtil.normalizeSpace(" rohte      t tri"+"\n"+"a"));
        System.out.println(StringUtil.normalizeSpace("re"+"\n"+" a"));
    }

    @Test
    public void endsWithAny() throws Exception {
    }

   /* @Test
    public String toString() {
        return null;
    }
*/
}