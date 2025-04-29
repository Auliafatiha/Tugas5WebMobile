<script setup>

</script>
<template>
  
  <div class="dasar">
        <main class="konten">
          <div class="ket">
            <p class="iam">I am an abstract painter</p>
            <p class="pelengkap">where colors speak louder than words, and every brushstroke is a whisper of emotion. My canvas is a realm of boundless imagination, where chaos and harmony dance in perfect unison. In abstraction, I do not paint what I see, but what I feel—shadows of thought, echoes of dreams, and the silent language of the soul</p>
          </div>
          <div class="pict">
            <img src="/public/hands.png" alt="">
          </div>
        </main>
    </div>
</template>

<style scoped>
.dasar{
    display: flex;
    height: 100vh;
    width: 100vw;
    
    
}
.konten{
  width: 1100px;
  background-color: aliceblue;
  position: relative;
  display: flex;
}

.ket{
  width: 400px;
  position: absolute;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  top: 50px;
  text-align: justify;
  gap: 0px;
  left: 40px;
}
.iam{
  font-size: 40px;
  font-weight: bold;
  
}
.pict{
  width: 400px;
  height: 300px;
  position: absolute;
  left: 500px;
}

.pict img{
  width: 300px;
  height: auto;
}

/* .tombol{
  width: 150px;
  height: 40px;
  border: 2px solid #A5B8CE;
  font-weight: bold;
  display: flex;
  align-items: center;
  justify-content: center;
  position: absolute;
  top: 440px;
  left: 35px;
}

.tombol:hover{
  background-color: #A5B8CE;
}

 */





</style>
