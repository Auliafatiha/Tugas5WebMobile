
<template>
    <div class = "dasar">
    <header>
        <p> Gallery <i>Lintang Serana</i> </p>
    </header>
    <main class="contain">
        
            <div class="gallery">
            <img src="/public/a.jpeg" alt="">
            <img src="/public/b.jpeg" alt="">
            <img src="/public/c.jpeg" alt="">
            <img src="/public/d.jpeg" alt="">
            <img src="/public/j.jpeg" alt="">
            <img src="/public/f.jpeg" alt="">
            <img src="/public/k.jpeg" alt="">
            </div>
            <div class="gallery2">
            <img src="/public/l.jpeg" alt="">
            <img src="/public/m.jpeg" alt="">
            <img src="/public/naga2.jpeg" alt="">
            <img src="/public/gadis.jpeg" alt="">
            <img src="/public/kuda.jpeg" alt="">
            <img src="/public/ikan.jpeg" alt="">
            <img src="/public/menyebrang.jpeg" alt="">
            </div>
        
    </main>

</div>
  
</template>

<style scoped>

.dasar{
    display: flex;
    height: 100%;
    width: 100%;
    flex-direction: column;
    position: relative;
    background-color: aliceblue;
}
header{
display: flex;
width: 1220px;
height: 40px;
top: 10px;
font-size: 30px;
font-weight: normal;
text-align: left;
padding: 10px;
align-items: center;



}


.contain{
    display: flex;
    flex-direction: column;
    position: relative;
    top: 10px;
    
    
}

.gallery{
 
    height: 150px;
    display: flex;
    justify-content: left;
    margin-top: 10px;
    gap: 5px;


   
    
}

.gallery img{
    width: 150px;
    height: auto;
    
}

.gallery2{
 
    height: 150px;
    display: flex;
    justify-content: left;
    margin-top: 10px;
    gap: 5px;

}

.gallery2 img{
    width: 150px;
    height: auto;
}


</style>
