package com.example.submissionaplikasiandroidsederhana

import com.example.submissionaplikasiandroidsederhana.playerData.playersDetails

object playerData {
    private val playersName = arrayOf(
        "Micheal Jordan",
        "Bill russell",
        "Larry Bird",
        "Karrem Abdul-Jabbar",
        "Tim Duncan",
        "Wilt Chamberlain",
        "Magic Johnson",
        "Lebron James",
        "Shaquille O'Neal",
        "Hakeem Olajuwon",
    )

    private val playersDetails = arrayOf(
        "Career playoff stats: 33.4 PPG, 6.4 RPG, 5.7 APG\n"+
                "\n" +
                "Accolades: 6 NBA titles, 6 Finals MVPs, 5 reg. season MVPs\n" +
                "\n" +
                "Michael Jordan is widely known as the game's greatest player—and for good reason.\n" +
                "\n" +
                "\"MJ\" accomplished everything possible in the game, piling up on the stats and awards. On the game's biggest stage—the NBA Finals—Jordan went a perfect 6-for-6, also sweeping Finals MVP in his appearances.\n" +
                "\n" +
                "The Chicago Bulls legend dominated both sides of the ball, amassing 11 All-NBA selections, nine All-Defensive First team selections and 10 scoring titles.\n" +
                "\n" +
                "There is plenty of evidence to support Michael Jordan's GOAT status, however, his greatest feat of all might have come before he even won an NBA title. In the 1988 season, he won MVP, Defensive Player of the Year and the NBA's scoring title. His insane '88 season went like this: 35 points on 53% shooting, 5.5 rebounds, 5.9 assists, 3.2 steals, 1.6 blocks.",

        "Career playoff stats: 16.2 PPG, 24.9 RPG, 4.7 APG\n" +
                "\n" +
                "Accolades: 11 NBA titles, 5 reg. season MVPs\n" +
                "\n" +
                "The greatest defender in the game's history led the Boston Celtics to a record 11 NBA Championships.\n" +
                "\n" +
                "Bill Russell is an interesting case, as his offensive stats don't jump out at you, but his impact went far beyond numbers. Russell could flat-out dominate the game defensively. Still, his career averages are nothing to sniff at, and if blocks and Finals MVPs were counted/awarded throughout his career, he would've won plenty of those.\n" +
                "\n" +
                "Russell is the greatest winner in all of sports. His 11-championship count may be the safest record in the NBA game.",

        "Career playoff stats: 23.8 PPG, 10.3 RPG, 6.5 APG\n" +
                "\n" +
                "Accolades: 3 NBA titles, 2 Finals MVPs, 3 reg. season MVPs\n" +
                "\n" +
                "Derrick Rose gave a rather fitting assessment of Larry Bird in an interview with Rappler Sports recently. Bird was never the most athletic player on the court, but he was always dominant. Whatever he lacked in athleticism, he made up for with his basketball IQ, great skills—including that deadly jump shot—and fierce competitiveness. \n" +
                "\n" +
                "Bird led the Boston Celtics to three NBA Championships, compiling three regular season MVPs and 2 Finals MVPs along the way. \"Larry Legend\" was selected to 10 All-NBA and three All-Defense Teams in his 13-year career.",

        "Career playoff stats: 24.3 PPG, 10.5 RPG, 2.4 BPG\n" +
                "\n" +
                "Accolades: 6 NBA titles, 2 Finals MVPs, 6 reg. season MVPs\n" +
                "\n" +
                "Before Duncan, there was Kareem Abdul-Jabbar, in terms of consistency. His ability to maintain such averages while competing for 20 seasons is simply a testament to his greatness.\n" +
                "\n" +
                "Here's a rundown of Kareem's biggest feats: all-time leading scorer in NBA history, most regular season MVP awards (six), 15 All-NBA selections, 11 All-Defense selections, 19 All-Star appearances.",

        "Career playoff stats: 21.9 PPG, 12.0 RPG, 2.4 BPG\n" +
                "\n" +
            "Accolades: 4 NBA titles, 3 Finals MVPs, 2 reg. season MVPs\n" +
                "\n" +
            "Tim Duncan is the model of consistency. Look through his statistics throughout the years, and you won't find too much variation.The Big Fundamental led the San Antonio Spurs to four NBA Championships, en route to three Finals MVPs. His perfect Finals record was blemished last season in a seven-game series loss to the Miami Heat, but four out of five isn't too bad. Duncan been selected to 14 All-NBA and All-Defensive Teams each and still looks to have a little left in the tank.",

        "Career playoff stats: 22.5 PPG, 24.5 RPG, 4.2 APG\n" +
                "\n" +
                "Accolades: 2 NBA titles, 1 Finals MVP, 4 reg. season MVPs\n" +
                "\n" +
                "Wilt Chamberlain is the reason I said Shaq was \"possibly\" the most dominant player of all time. Chamberlain's dominance is widely acknowledged, and as time passes he seems more and more like a mythical figure. In the 1961-62 regular season, he averaged 50.4 points and 25.7 rebounds. Simply unreal.\n" +
                "\n" +
                "Had Wilt accomplished more in the postseason, he would be closer to No. 1. It seems crazy to expect more from a player who averaged 22 and 25, but that's how it goes when you're the most dominant.\n" +
                "\n",

        "Career playoff stats: 19.5 PPG, 7.7 RPG, 12.3 APG\n" +
                "\n" +
                "Accolades: 5 NBA titles, 3 Finals MVPs, 3 reg. season MVPs\n" +
                "\n" +
                "Magic Johnson began his career with greatness and never looked back. He won Finals MVP as a rookie when he famously started center in place of the injured Kareem Abdul-Jabbar in Game 6 of the 1980 NBA Finals. The Finals were like a second home to Magic and the Showtime Los Angeles Lakers, as they made nine trips during his illustrious career.\n" +
                "\n" +
                "The 6'9\" point guard used his large frame to shred defenses with precision. Magic's 12.3 assists ranks first all-time in the playoffs. In his 14-year career, he amassed 10 All-NBA selections.",

        "Career playoff stats: 28.1 PPG, 8.6 RPG, 6.7 APG\n" +
                "\n" +
                "Accolades: 2 NBA titles, 2 Finals MVPs, 4 reg. season MVPs\n" +
                "\n" +
                "LeBron James entered the league burdened with unimaginable expectations. Expectations he surely couldn't live up to, right?\n" +
                "\n" +
                "Wrong. The Miami Heat superstar has gotten the championship monkey off of his back two times over and is now chasing history. Just 10 seasons into his NBA career, he's already one of the game's all-time greats. The statistics and MVP counts speak for themselves. \"King James\" has developed into a great two-way player, being named to 9 All-NBA and 5 All-Defensive Teams.\n" +
                "\n" +
                "The next player on the list shouldn't get too comfortable, because LeBron could be slowly creeping up the list by the end of this coming season.",

        "Career playoff stats: 24.3 PPG, 11.6 RPG, 2.1 BPG\n" +
                "\n" +
                " Accolades: 4 NBA titles, 3 Finals MVPs, 1 reg. season MVP\n " +
                "\n" +
                "Shaquille O'Neal was the most dominant player of his generation—possibly of all time. It was borderline unfair how he brutalized defenders with brute strength.\n " +
                "\n" +
                "Shaq led the Los Angeles Lakers to three consecutive NBA Championships in the early 2000s, winning three Finals MVPs in the process. The 2000 regular season MVP winner was also selected to 14 All-NBA Teams in his career.\n",

        "Career playoff stats: 25.9 PPG, 11.2 RPG, 3.3 BPG\n " +
                "\n" +
                "Accolades: 2 NBA titles, 2 Finals MVPs, 1 reg. season MVP\n " +
                "\n" +
                "Mostly regarded as the most skilled big man in the history of the game, Hakeem Olajuwon's dominance on the inside was a thing of beauty. He abused many a defender with his trademark \"Dream Shake\" move. Olajuwon's game is so renowned that superstars like Kobe Bryant, LeBron James and Dwight Howard have looked to improve their game under his tutelage. Offense aside, Olajuwon was one of the game's greatest defenders, partly evidenced by his 3.3 block-per-game average.\n" +
                "\n" +
                " \"The Dream\" led a marginally-talented Houston Rockets team to back-to-back NBA Championships, winning two Finals MVPs and one regular season MVP. He is the only player in NBA history to win regular season MVP, Finals MVP and Defensive Player of the Year in the same season (1994).\n"
    )

    private val playerPhoto = intArrayOf(
        R.drawable.micheal,
        R.drawable.bill,
        R.drawable.larry_bird,
        R.drawable.kareem,
        R.drawable.duncan,
        R.drawable.wilt,
        R.drawable.magic,
        R.drawable.lebron,
        R.drawable.shaq,
        R.drawable.hakeem,
    )

    val listData : ArrayList<player>
    get() {
        val list = arrayListOf<player>()
        for (position in playersName.indices) {
            val players = player()
            players.name = playersName[position]
            players.details = playersDetails[position]
            players.photo = playerPhoto[position]
            list.add(players)
        }
        return list
    }
}