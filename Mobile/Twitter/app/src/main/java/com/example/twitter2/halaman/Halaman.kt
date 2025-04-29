package com.example.twitter2.halaman
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.core.content.ContextCompat
import com.example.twitter2.R
import android.app.AlertDialog
class Halaman(context: Context, attributeSet: AttributeSet): View(context,attributeSet) {

    //paint
    val paintdasar = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLACK
        style = Paint.Style.FILL
    }

    val paintteksjowo = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textSize = 30f
        typeface = Typeface.DEFAULT_BOLD

    }

    val painttotalpostingan = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.GRAY
        textSize = 24f
    }

    val kotakpotosampul = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.BLUE
    }
    val lingkaran = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLUE
        style = Paint.Style.FILL

    }

    val lingkaranmore = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLUE
        style = Paint.Style.FILL
        style = Paint.Style.STROKE
        strokeWidth = 3f
    }
    val lingkarancari = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLUE
        style = Paint.Style.STROKE
        strokeWidth = 3f
    }
    val lingkaran2 = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLUE
        style = Paint.Style.STROKE
        strokeWidth = 3f
    }
    val lingkaranpesan = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLUE
        style = Paint.Style.STROKE
        strokeWidth = 3f
    }

    val buttonmengikuti = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        style = Paint.Style.FILL
    }
    val paintteksmengikuti = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLACK
        textAlign = Paint.Align.CENTER
        textSize = 24f
        typeface = Typeface.DEFAULT_BOLD

    }

    val paintnamaakun = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        style = Paint.Style.FILL
        typeface = Typeface.DEFAULT_BOLD
        textSize = 55f
    }

    val paintusername = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.GRAY
        style = Paint.Style.FILL
        textSize = 35f
    }

    val paintbioemail = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLUE
        textSize = 35f
    }
    val paintbio = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textSize = 35f
    }
    val paintbio2 = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textSize = 35f
    }
    val paintbio3 = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textSize = 35f
    }
    val paintbio4 = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textSize = 35f
    }

    val paintlokasi = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.GRAY
        textSize = 35f
    }

    val paintnamainstagram = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLUE
        textSize = 35f
    }

    val painttanggalgabung = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.GRAY
        textSize = 35f
    }

    val painttotalmengikuti = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textSize = 35f
    }
    val paintmengikuti = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.GRAY
        textSize = 35f
    }
    val paintbanyakpengikut = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textSize = 35f
    }
    val paintpengikut = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.GRAY
        textSize = 35f
    }
    val paintpostingan = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textSize = 40f
    }
    val paintbalasan = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.GRAY
        textSize = 40f
    }
    val paintmedia = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.GRAY
        textSize = 40f
    }
    val paintgaris = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.GRAY
        style = Paint.Style.STROKE
        strokeWidth = 1f

    }
    val paintgarisbiru = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLUE
        style = Paint.Style.STROKE
        strokeWidth = 4f
    }


    //teks
    val jowoshitpost = "Jowoshitpost"
    val totalpostingan = "2.020 postingan"
    val teksmengikuti = "Mengikuti"
    val teksnamaakun = "Jowoshitpost"
    val teksusername = "@jawashitpost"
    val teksbio = "Sugeng rawuh kagem dulur sedoyo sampun"
    val teksbio2 = "persani,"
    val teksbio3 = "namung akun guyonan,"
    val teksbio4 = "matur sembah nuwun."

    val teksjawa = "Jawa"
    val teksinstagram = "instgram.com/jowoshitpost"
    val teksbergabung = "Bergabung April 2022"
    val teks1 = "1"
    val teksmengikuti2 = "Mengikuti"
    val teks363 = "363,7 ribu"
    val tekspengikut = "pengikut"
    val tekspostingan2 = "Postingan"
    val teksbalasan = "Balasan"
    val teksmedia = "Media"


    //gambar
    val back = ContextCompat.getDrawable(context, R.drawable.back)
    val search = ContextCompat.getDrawable(context, R.drawable.searchl)
    val more = ContextCompat.getDrawable(context, R.drawable.more)
    val mail = ContextCompat.getDrawable(context, R.drawable.mail)
    val location = ContextCompat.getDrawable(context, R.drawable.location)
    val calender = ContextCompat.getDrawable(context, R.drawable.calendar)
    val link = ContextCompat.getDrawable(context, R.drawable.link)
    val memesampul = ContextCompat.getDrawable(context, R.drawable.memejawa)
    val memeprofil = ContextCompat.getDrawable(context, R.drawable.nails)


    // Membuat Button
    private var isFollowing = false
    private var isHovering = false

    val buttonpanjang = 150f
    val buttonlebar = 80f

    val buttonleft = 400 + 110f
    val buttontop = 700 - 40f
    val buttonright = buttonleft + buttonpanjang
    val buttonbottom = buttontop + buttonlebar

    val buttonrect = RectF(buttonleft, buttontop, buttonright, buttonbottom)


    //mengatur padding
    init {
        val paddingInDp = 20
        val scale = context.resources.displayMetrics.density
        val paddingInPx = (paddingInDp * scale + 0.5f).toInt()

        // Mengatur padding pada semua sisi
        setPadding(paddingInPx, paddingInPx, paddingInPx, paddingInPx)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas?.drawRect(0f, 0f, width - 0f, height - 0f, paintdasar)

        //mengatur ikon back
        val backsize = 40f
        val backleft = paddingLeft
        val backtop = paddingTop
        val backright = (backleft + backsize).toInt()
        val backbottom = (backtop + backsize).toInt()
        back?.setBounds(backleft, backleft, backright, backbottom)
        back?.draw(canvas)

        // mengatur tulisan jowhitspost
        val jowoshitleft = backbottom + 50f
        val jowoshittop = backtop.toFloat()

        canvas?.drawText(jowoshitpost, jowoshitleft, jowoshittop, paintteksjowo)

        //mengatur tulisan 2020 postingan
        val ttlpostleft = jowoshitleft
        val ttlposttop = (jowoshittop + 20f) + 20f

        canvas?.drawText(totalpostingan, ttlpostleft, ttlposttop, painttotalpostingan)

        canvas.save()
        //membuat kotak sampul
        val lebarsampul = 984
        val panjangsampul = 400

        val sampulleft = paddingLeft.toFloat()
        val sampultop = ttlposttop + 50f
        val sampulright = sampulleft + lebarsampul
        val sampulbottom = sampultop + panjangsampul
        val pathsampul = Path()
        val rectsampul = RectF(sampulleft, sampultop, sampulright, sampulbottom)

        pathsampul.addRoundRect(rectsampul, 0f, 0f, Path.Direction.CW)
        canvas.clipPath(pathsampul)

        memesampul?.let {
            it.setBounds(
                sampulleft.toInt(),
                sampultop.toInt(),
                sampulright.toInt(),
                sampulbottom.toInt()
            )
            it.draw(canvas)
        }
        canvas.restore()

        //membuat foto profil
        canvas.save()
        val profilsize = 500f
        val profilleft = sampulleft + 150
        val profiltop = sampulbottom - 30f
        val profilright = profilleft
        val profilbottom = profiltop
        val radiusprofil = 120f

        val pathprofil = Path()
        pathprofil.reset()
        pathprofil.addCircle(profilleft, profiltop, radiusprofil, Path.Direction.CW)
        canvas.clipPath(pathprofil)

        memeprofil?.let {
            it.setBounds(
                (profilleft - radiusprofil).toInt(),
                (profiltop - radiusprofil).toInt(),
                (profilright + radiusprofil).toInt(),
                (profilbottom + radiusprofil).toInt()
            )
            it.draw(canvas)
        }
        canvas.restore()

        //membuat ikon more
        canvas.save()
        val moreleft = paddingLeft + 70f
        val moretop = profilbottom + 200f
        val moreright = moreleft
        val morebottom = moretop
        val moreradius = 40f

        canvas?.drawCircle(moreleft, moretop, moreradius, lingkaranmore)
        val pathmore = Path()
        pathmore.reset()
        pathmore.addCircle(moreleft, moretop, moreradius, Path.Direction.CW)
        canvas.clipPath(pathmore)

        more?.let {
            it.setBounds(
                (moreleft - 20).toInt(),
                (moretop - 20).toInt(),
                (moreright + 20).toInt(),
                (morebottom + 20).toInt()
            )
            it.draw(canvas)
        }
        canvas.restore()

        //membuat ikon more
        canvas.save()
        val searchleft = moreright + 110
        val searhtop = profilbottom + 200f
        val searchright = searchleft
        val searchbottom = searhtop
        val searchradius = 40f

        canvas?.drawCircle(searchleft, searhtop, searchradius, lingkarancari)
        val pathsearch = Path()
        pathsearch.reset()
        pathsearch.addCircle(searchleft, searhtop, searchradius, Path.Direction.CW)
        canvas.clipPath(pathsearch)

        search?.let {
            it.setBounds(
                (searchleft - 20).toInt(),
                (searhtop - 20).toInt(),
                (searchright + 20).toInt(),
                (searchbottom + 20).toInt()
            )
            it.draw(canvas)
        }
        canvas.restore()

        //membuat ikon mail
        canvas.save()
        val mailleft = searchright + 110
        val mailtop = profilbottom + 200f
        val mailright = mailleft
        val mailbottom = mailtop
        val mailradius = 40f

        canvas?.drawCircle(mailleft, mailtop, mailradius, lingkaranpesan)
        val pathmail = Path()
        pathmail.reset()
        pathmail.addCircle(mailleft, mailtop, mailradius, Path.Direction.CW)
        canvas.clipPath(pathmail)

        mail?.let {
            it.setBounds(
                (mailleft - 20).toInt(),
                (mailtop - 20).toInt(),
                (mailright + 20).toInt(),
                (mailbottom + 20).toInt()
            )
            it.draw(canvas)
        }
        canvas.restore()

        canvas.save()
//        val buttonpanjang = 150f
//        val buttonlebar = 80f
//
//        val buttonleft = mailright + 110f
//        val buttontop = mailtop - 40
//        val buttonright = buttonleft + buttonpanjang
//        val buttonbottom = buttontop + buttonlebar
//
//
//        val buttonrect = RectF(buttonleft,buttontop,buttonright,buttonbottom)
        val btnText = when {
            isFollowing && isHovering -> "Unfollow"
            isFollowing -> "Following"
            else -> "Follow"
        }
        buttonmengikuti.color = if (isFollowing) Color.DKGRAY else Color.BLUE
        canvas?.drawRoundRect(buttonrect, 30f, 30f, buttonmengikuti)

        val textleft = (buttonleft + buttonright) / 2
        val texttop =
            (buttontop + buttonbottom) / 2f - (paintteksmengikuti.descent() + paintteksmengikuti.ascent()) / 2f
        canvas.drawText(btnText, textleft, texttop, paintteksmengikuti)

        val teksnamaakunleft = moreleft - 40
        val teksnamaakuntop = buttonbottom + 100
        canvas?.drawText(teksnamaakun, teksnamaakunleft, teksnamaakuntop, paintnamaakun)


        val teksusernameleft = moreleft - 40
        val teksusernametop = teksnamaakuntop + 70
        canvas?.drawText(teksusername, teksusernameleft, teksusernametop, paintusername)

        val teksusername2left = moreleft - 40
        val teksusename2top = teksusernametop + 80
        canvas?.drawText(teksusername, teksusername2left, teksusename2top, paintbioemail)

        val spasi = 20
        val teksusername2lebar = paintbioemail.measureText(teksusername)

        val teksbioleft = teksusername2left + teksusername2lebar + spasi
        val teksbiotop = teksusernametop + 80
        canvas?.drawText(teksbio, teksbioleft, teksbiotop, paintbio)

        val teksbio2left = teksusername2left
        val teksbio2top = teksbiotop + 50
        canvas?.drawText(teksbio2, teksbio2left, teksbio2top, paintbio2)

        val teksbio3left = teksbio2left + 140
        val teksbio3top = teksbio2top
        canvas?.drawText(teksbio3, teksbio3left, teksbio3top, paintbio3)

        val teksbio3lebar = paintbio3.measureText(teksbio3)


        val teksbio4left = teksbio3left + teksbio3lebar + spasi
        val teksbio4top = teksbio2top
        canvas?.drawText(teksbio4, teksbio4left, teksbio4top, paintbio4)

        val lebarikon = 50
        val lokasileft = teksusername2left
        val lokasitop = teksbio4top + 70
        location?.setBounds(
            lokasileft.toInt(),
            lokasitop.toInt(),
            (lokasileft + lebarikon).toInt(),
            (lokasitop + lebarikon).toInt()
        )
        location?.draw(canvas)

        val spasiikon = 20f
        val teksjawaleft = lokasileft + lebarikon + spasiikon
        val teksjawatop = lokasitop + 40
        canvas?.drawText(teksjawa, teksjawaleft, teksjawatop, paintlokasi)

        val teksjawalebar = paintlokasi.measureText(teksjawa)
        val linkleft = teksjawaleft + teksjawalebar + 40
        val linktop = lokasitop
        link?.setBounds(
            linkleft.toInt(),
            linktop.toInt(),
            (linkleft + lebarikon).toInt(),
            (linktop + lebarikon).toInt()
        )
        link?.draw(canvas)

        val teksinstagramleft = linkleft + lebarikon + spasiikon
        val teksinstagramtop = lokasitop + 40
        canvas?.drawText(teksinstagram, teksinstagramleft, teksinstagramtop, paintnamainstagram)

        val calenderleft = teksusername2left
        val calendertop = teksinstagramtop + 30
        calender?.setBounds(
            calenderleft.toInt(),
            calendertop.toInt(),
            (calenderleft + lebarikon).toInt(),
            (calendertop + lebarikon).toInt()
        )
        calender?.draw(canvas)

        val teksgabungleft = calenderleft + lebarikon + spasiikon
        val teksgabungtop = calendertop + 40
        canvas?.drawText(teksbergabung, teksgabungleft, teksgabungtop, painttanggalgabung)

        val teks1left = teksusernameleft
        val teks1top = teksgabungtop + 100
        canvas?.drawText(teks1, teks1left, teks1top, painttotalmengikuti)

        val teks1lebar = painttotalmengikuti.measureText(teks1)

        val teksmengikuti2left = teks1left + teks1lebar + spasi
        val teksmengikuti2top = teks1top
        canvas?.drawText(teksmengikuti2, teksmengikuti2left, teksmengikuti2top, paintmengikuti)

        val teksmengikuti2lebar = paintmengikuti.measureText(teksmengikuti2)
        val teks363left = teksmengikuti2left + teksmengikuti2lebar + 60
        val teks363top = teks1top
        canvas?.drawText(teks363, teks363left, teks363top, paintbanyakpengikut)

        val teks363lebar = paintbanyakpengikut.measureText(teks363)
        val tekspengikutleft = teks363left + teks363lebar + spasi
        val tekspengikuttop = teks1top
        canvas?.drawText(tekspengikut, tekspengikutleft, tekspengikuttop, paintpengikut)

        val jarak = 200
        val tekspostinganleft = teksmengikuti2left
        val tekspostingantop = tekspengikuttop + 150
        canvas?.drawText(tekspostingan2, tekspostinganleft, tekspostingantop, paintpostingan)

        val tekspostinganlebar = paintpostingan.measureText(tekspostingan2)
        val teksbalasanleft = tekspostinganleft + tekspostinganlebar + jarak
        val teksbalasantop = tekspostingantop
        canvas?.drawText(teksbalasan, teksbalasanleft, teksbalasantop, paintbalasan)

        val teksbalasanlebar = paintbalasan.measureText(teksbalasan)
        val teksmedialeft = teksbalasanleft + teksbalasanlebar + jarak
        val teksmediatop = tekspostingantop
        canvas?.drawText(teksmedia, teksmedialeft, teksmediatop, paintmedia)


    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                if (buttonrect.contains(event.x, event.y)) {
                    if (!isFollowing) {
                        isFollowing = true
                        invalidate()
                    } else {
                        AlertDialog.Builder(context).setTitle("Konfirmasi").setMessage("Apakah anda yakin ingin berhenti mengikuti")
                            .setPositiveButton("ya") { dialog,_ ->
                                isFollowing = false
                                invalidate()
                                dialog.dismiss()
                            }
                            .setNegativeButton("Batal") { dialog, _ -> dialog.dismiss() }
                            .show()

                    }

                }

            }

        }

        return true
    }

    override fun onHoverEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_HOVER_ENTER -> {
                isHovering = true
                invalidate()
            }

            MotionEvent.ACTION_HOVER_EXIT -> {
                isHovering = false
                invalidate()
            }
        }
        return true
    }
}

