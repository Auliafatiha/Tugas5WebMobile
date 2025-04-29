package com.example.twitter2

import android.content.Context
import android.graphics.*
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat

class coba(context: Context, attrs: AttributeSet? = null) : View(context, attrs) {

    // Data akun
    var profileDrawable = ContextCompat.getDrawable(context, R.drawable.memenails) // ganti dengan resource foto profil
    var fullName: String = "John Doe"
    var username: String = "@johndoe"
    var bio: String = "Ini adalah bio akun. Deskripsi singkat tentang pengguna, hobi, atau informasi lain yang relevan."

    // Ukuran dan margin (dalam pixel)
    private val profileSize = (80 * resources.displayMetrics.density).toInt() // misal 80dp
    private val margin = (16 * resources.displayMetrics.density).toInt()

    // TextPaint untuk nama lengkap
    private val namePaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLACK
        textSize = 20f * resources.displayMetrics.scaledDensity  // 20sp
        typeface = Typeface.DEFAULT_BOLD
    }

    // TextPaint untuk username
    private val usernamePaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.DKGRAY
        textSize = 16f * resources.displayMetrics.scaledDensity  // 16sp
    }

    // TextPaint untuk bio
    private val bioPaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.GRAY
        textSize = 14f * resources.displayMetrics.scaledDensity  // 14sp
    }

    // StaticLayout untuk bio agar bisa tampil multi baris
    private var bioLayout: StaticLayout? = null

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        // Ambil lebar view yang tersedia
        val width = MeasureSpec.getSize(widthMeasureSpec)

        // Hitung lebar area teks setelah foto profil
        val textAreaWidth = width - profileSize - 3 * margin

        // Buat StaticLayout untuk bio agar teks bisa membungkus dan multi baris
        bioLayout = StaticLayout(
            bio, bioPaint, textAreaWidth,
            Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false
        )

        // Tinggi header = maksimum antara tinggi foto profil dan tinggi nama+username+bio, ditambah margin
        val nameHeight = (namePaint.fontMetrics.descent - namePaint.fontMetrics.ascent).toInt()
        val usernameHeight = (usernamePaint.fontMetrics.descent - usernamePaint.fontMetrics.ascent).toInt()
        val bioHeight = bioLayout?.height ?: 0

        // Misal: teks dimulai di sebelah foto profil, dan jika tinggi teks lebih tinggi dari foto profil, gunakan tinggi teks + margin
        val textTotalHeight = nameHeight + usernameHeight + bioHeight + 2 * margin

        // Tinggi view adalah maksimum antara profileSize dan textTotalHeight, ditambah margin atas dan bawah
        val desiredHeight = margin * 2 + maxOf(profileSize, textTotalHeight)

        setMeasuredDimension(width, desiredHeight)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Koordinat awal (margin)
        val startX = margin.toFloat()
        val startY = margin.toFloat()

        // Gambar foto profil di pojok kiri atas
        profileDrawable?.let { drawable ->
            drawable.setBounds(
                startX.toInt(),
                startY.toInt(),
                (startX + profileSize).toInt(),
                (startY + profileSize).toInt()
            )
            drawable.draw(canvas)
        }

        // Posisi teks sebelah foto profil
        val textX = startX + profileSize + margin
        var currentY = startY

        // Gambar nama lengkap
        canvas.drawText(fullName, textX, currentY - namePaint.fontMetrics.ascent, namePaint)
        currentY += (namePaint.fontMetrics.descent - namePaint.fontMetrics.ascent).toInt() + margin / 2

        // Gambar username
        canvas.drawText(username, textX, currentY - usernamePaint.fontMetrics.ascent, usernamePaint)
        currentY += (usernamePaint.fontMetrics.descent - usernamePaint.fontMetrics.ascent).toInt() + margin / 2

        // Gambar bio dengan StaticLayout
        canvas.save()
        canvas.translate(textX, currentY)
        bioLayout?.draw(canvas)
        canvas.restore()
    }
}
