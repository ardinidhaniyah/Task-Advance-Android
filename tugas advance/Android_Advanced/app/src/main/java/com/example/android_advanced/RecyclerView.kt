package com.example.android_advanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerView : AppCompatActivity() {
    private lateinit var rvItem: RecyclerView
    private lateinit var adapter: RvAdapter
    private var dataItems = arrayListOf<DataItem>(
        DataItem("https://i.pinimg.com/736x/82/ae/ff/82aeff6a9c6ecfeca7ae8c2e658c52df.jpg","pseudycus | Silly quotes, Aesthetic poetry, Quotes","JUNI 25, 2023","https://images.app.goo.gl/e6nhiovwmx3Pcoio9"),
        DataItem("https://e1.pxfuel.com/desktop-wallpaper/313/347/desktop-wallpaper-poem-aesthetic-poetic.jpg","Poem aesthetic HD wallpapers | PxfuelPoem aesthetic HD wallpapers | Pxfuel","JUNI 22, 2023","https://images.app.goo.gl/f7VcXCLpyNKzawEz8"),
        DataItem("https://img.poemhunter.com/i/poem_images/145/aesthetic.jpg","Aesthetic - Aesthetic Poem by Anisha Nyambe","JUNI 21, 2022","https://images.app.goo.gl/TE6zwZF4DYGhQ5wn7"),
        DataItem("https://ih1.redbubble.net/image.1271867579.3134/aps,504x498,medium,transparent-pad,600x600,f8f8f8.jpg","Equinox Poem + Heart Illustration (Light)","JUNI 19, 2023","https://images.app.goo.gl/qRj5KVA7cbZDWHsUA"),
        DataItem("https://favim.com/pd/p/orig/2019/03/09/aesthetic-quote-poetry-Favim.com-6972261.jpg","aesthetic, quote and poetry","JUNI 18, 2023","https://images.app.goo.gl/JvqkxTcZvL9zbUccA"),
        DataItem("https://images.saymedia-content.com/.image/ar_16:9%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cq_auto:eco%2Cw_1200/MTgxMDAzNTUwMDUzMTE1MjQw/aesthetic-a-guide-to-poetry.jpg","How To Write Bad Poetry","JUNI 17, 2023","https://images.app.goo.gl/bd9TcnipY2gRLtKT8"),
        DataItem("https://i.pinimg.com/originals/81/e6/32/81e6327ec5cca04c55148199f42a7187.jpg","Pin on Asterrmis PoetryPin on Asterrmis Poetry","JUNI 15, 2022","https://images.app.goo.gl/xcQ7Q61bbZHEb7ro7"),
        DataItem("https://pbs.twimg.com/media/DOEBP5rUQAA7R8C.jpg","poetrysandoval on X","JUNI 10, 2019","https://images.app.goo.gl/BYhjDjkkdDDutjJe9"),
        DataItem("https://images.saymedia-content.com/.image/t_share/MTc1ODkxMTU1OTkxNDA2NDU3/acrostic-poems-aesthetic-words.jpg","Acrostic poems - Aesthetic words - LetterPile","MEI 27, 2022","https://images.app.goo.gl/Z4wYTi7pDURfZE639"),
        DataItem("https://res.cloudinary.com/teepublic/image/private/s--qGu_UdE5--/c_crop,x_10,y_10/c_fit,h_830/c_crop,g_north_west,h_1038,w_1038,x_-161,y_-104/l_upload:v1565806151:production:blanks:vdbwo35fw6qtflw9kezw/fl_layer_apply,g_north_west,x_-272,y_-215/b_rgb:000000/c_limit,f_auto,h_630,q_auto:good:420,w_630/v1648892067/production/designs/29071874_0.jpg","Vintage retro aesthetic books coffee lover bookworm biblichore poetry heart love romantic music literature - Heart - Pin | TeePublic","MEI 17, 2023","https://images.app.goo.gl/nT9oLQEe15Jx4s3k9")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        init()
        setupUI()
    }

    private fun init() {
        rvItem = findViewById(R.id.rv_item)
        rvItem.layoutManager = LinearLayoutManager(this)
        adapter = RvAdapter(this, arrayListOf())
        rvItem.adapter = adapter
    }

    private fun setupUI() {
        getData()
    }

    private fun getData() {
        retrieveList(dataItems)
    }

    private fun retrieveList(items: List<DataItem>) {
        adapter.apply {
            addItems(items)
            notifyDataSetChanged()
        }
    }
}