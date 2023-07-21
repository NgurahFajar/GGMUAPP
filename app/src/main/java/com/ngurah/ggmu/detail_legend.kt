package com.ngurah.ggmu

object detail_legend {

    private var detail_name = arrayOf(

           "Alex Ferguson",
           "Roy Keane",
           "Gary Neville",
           "Cristiano Ronaldo",
           "Paul Scholes",
           "Van Der Sar",
           "Wayne Rooney",
           "Luis Nani",
           "Patrice Evra",
           "Rio Ferdinand"
        )

    private var detail_photo = intArrayOf(
        R.drawable.alex,
        R.drawable.roykeane,
        R.drawable.garry,
        R.drawable.cristiano,
        R.drawable.paul,
        R.drawable.vandersar,
        R.drawable.rooney,
        R.drawable.nani,
        R.drawable.evra,
        R.drawable.ferdinand
    )

    private var detail_description = arrayOf(
        "Sir Alexander Chapman atau yang lebih dikenal dengan Sir Alex Ferguson CBE (lahir 31 Desember 1941) adalah seorang pelatih dan mantan pemain sepak bola berkebangsaan Skotlandia, yang pernah menangani Manchester United, Sir Alex dianggap sebagai salah satu pelatih terbaik dalam sejarah",
        "Roy Maurice Keane (lahir 10 Agustus 1971 di Mayfield, Cork, Irlandia) adalah mantan pemain sepak bola profesional dan saat ini merupakan assisten dari tim nasional Republik Irlandia.Seorang sentral dominan-gelandang, Keane disebut-sebut sebagai salah satu pemain terbaik di eranya.",
        "Gary Alexander Neville (lahir 18 Februari 1975) merupakan seorang mantan pemain sepak bola asal Inggris. Neville dahulu berposisi sebagai bek kanan dan bermain untuk Manchester United selama kariernya.",
        "Cristiano Ronaldo memainkan peran menyerang, paling sering bermain baik sebagai striker atau sebagai pemain sayap,dan dikenal karena finishing, kecepatan, dribbling, positioning, passing dan kemampuan crossing.",
        "Paul Scholes (lahir 16 November 1974) adalah mantan pemain sepak bola dari Inggris yang menghabiskan semua kariernya bermain untuk klub Manchester United. Ia memulai Karier debutnya pada musim 1994 sampai 1995 dan menjadi Pemain kunci ketika United memenangkan Treble Winners pada musim 1998 sampai 1999",
        "Edwin van der Sar yang lahir 29 Oktober 1970 adalah seorang mantan pemain sepak bola profesional asal Belanda, yang bermain sebagai penjaga gawang. Ia pernah bermain untuk klub Manchester United di Liga Utama Inggris.",
        "Wayne Mark Rooney yang lahir 24 Oktober 1985 adalah seorang pelatih dan mantan pemain sepak bola profesional yang kini menjadi kepala pelatih klub MLS D.C. United. Sebagai pemain profesional, Rooney dikenal saat bermain sebagai penyerang",
        "Luís Carlos Almeida da Cunha (lahir 17 November 1986), lebih dikenal sebagai Nani  adalah seorang pemain sepak bola profesional asal Portugal yang bermain sebagai gelandang sayap",
        "Patrice Evra (lahir 15 Mei 1981) adalah mantan pemain sepak bola Prancis-Senegal, yang terakhir kali bermain untuk klub Inggris Manchester United. Dia dulu bermain di posisi bek kiri walaupun dia juga dapat bermain di posisi sayap kiri.",
        "Rio Ferdinand (lahir 7 November 1978) adalah seorang pemain sepak bola Inggris. Seorang bek tengah, dia terakhir bermain di Queens Park Rangers."
    )

    private var detail_title = arrayOf(
        "Mari Mengenal Sir Alex Ferguson",
        "Mari Mengenal Roy Keane",
        "Mari Mengenal Gary Neville",
        "Mari Mengenal Cristiano Ronaldo",
        "Mari Mengenal Paul Scholes",
        "Mari Mengenal Van Der Sar",
        "Mari Mengenal Wayne Rooney",
        "Mari Mengenal Luis Nani",
        "Mari mengenal Patrice Evra",
        "Mari mengenal Rio Ferdinand"
    )

    private var detail_prestasinya = arrayOf(
        "Pencapaian Yang Pernah Dicapai: ",
        "Pencapaian Yang Pernah Dicapai: ",
        "Pencapaian Yang Pernah Dicapai: ",
        "Pencapaian Yang Pernah Dicapai: ",
        "Pencapaian Yang Pernah Dicapai: ",
        "Pencapaian Yang Pernah Dicapai: ",
        "Pencapaian Yang Pernah Dicapai: ",
        "Pencapaian Yang Pernah Dicapai: ",
        "Pencapaian Yang Pernah Dicapai: ",
        "Pencapaian Yang Pernah Dicapai: ",
    )


    private var detail_prestasi = arrayOf(
        "Dua piala Liga Champions, 13 gelar liga Inggris, lima Piala FA, dan empat Piala Liga.",
        "Liga Utama Inggris (7): 1993-94, 1995-96, 1996-97, 1998-99, 1999-2000, 2000-01, 2002-03",
        "Tiga piala Liga Champions, 13 gelar liga Inggris, lima Piala FA, dan empat Piala Liga.",
        "Liga Utama Inggris (7): 1993-94, 1995-96, 1996-97, 1998-99, 1999-2000, 2000-01, 2002-03, 3 Piala FA",
        "Satu piala Liga Champions, 13 gelar liga Inggris, lima Piala FA, dan empat Piala Liga.",
        "Dua piala Liga Champions, 11 gelar liga Inggris, lima Piala FA, dan empat Piala Liga.",
        "Empat piala Liga Champions, 17 gelar liga Inggris, lima Piala FA, dan empat Piala Liga.",
        "Lima piala Liga Champions, 13 gelar liga Inggris, lima Piala FA, dan empat Piala Liga.",
        "Dua piala Liga Champions, 13 gelar liga Inggris, lima Piala FA, dan empat Piala Liga.",
        "Liga Utama Inggris (7): 1993-94, 1995-96, 1996-97, 1998-99, 1999-2000, 2000-01, 2002-03"

    )



    val listData: ArrayList<Legend>
        get() {
            val list = ArrayList<Legend>()
            for (position in detail_name.indices) {
                var post = Legend()
                post.name = detail_name[position]
                post.photo = detail_photo[position]
                post.title = detail_title[position]
                post.description = detail_description[position]
                post.prestasinya = detail_prestasinya[position]
                post.prestasi = detail_prestasi[position]
                list.add(post)
            }
            return list
        }

}
