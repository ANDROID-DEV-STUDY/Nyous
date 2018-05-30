package kr.co.androidstudy.nyous.model

/**
 * Created by leejongjin on 2018. 5. 29..
 */

data class NyousPost(
        val source : Source,
        val author : String?,
        val title : String?,
        val description : String?,
        val url : String?,
        val urlToImage : String?,
        val publishedAt : String?
) {
    data class Source(
            val id : String?,
            val name : String?)
}



//{
//    "source": {
//    "id": null,
//    "name": "Joins.com"
//},
//    "author": "중앙일보",
//    "title": "'허위경력' 소방공무원 82명 적발…임용무효·수사의뢰",
//    "description": "【서울=뉴시스】배민욱 기자 = 허위경력으로 채용된 소방공무원 82명이 적발됐다. 소방청은 이들에 대해 임용무효와 수사의뢰을 추진한다.   소방청은 30일 허위경력으로 채용된 소방공무원 전수조사 결과를 밝표하고 적발된 82명에 대해 임용무효와 수사의뢰을 추진한다고 밝혔다. 최근 3년간 구급대원 채용인력 중 민간",
//    "url": "http://news.joins.com/article/22668917?cloc=rss|news|total_list",
//    "urlToImage": "http://pds.joins.com/news/component/newsis/201805/30/NISI20180411_0000132261_web.jpg",
//    "publishedAt": "2018-05-30T03:17:28Z"
//}
