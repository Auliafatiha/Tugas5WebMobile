<script setup>
import { RouterView } from 'vue-router';


</script>

<template>
  
  <div class="dasar">
        <aside class="Aside">
              <div class="menu">
              <img src="/public/girl.jpeg" alt="">
              <p class="name"> Lintang Serana</p>
              <p class="provesi">Pelukis Abstrak</p>
              <nav>
                <router-link to="/">About Me</router-link>
                <router-link to="/about">My Gallery</router-link>
              </nav>
              <div class="footer">
                <p>&copy; 2025 NamaWebsite. All Rights Reserved.</p>
                <p>Made by Love</p>
              </div>
            </div>
        </aside>

        <main class="konten">
          
          <RouterView></RouterView>
        </main>
    </div>
</template>

<style scoped>
.dasar{
    display: flex;
    height: 100vh;
    width: 100vw;
    
    
}

.Aside{
  background-color: #DCE8F2;
  color: black;
  width: 250px;
  height: auto;

}

.menu{
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 5px;
}

 .menu img{

  width: 100px;
  height: 100px;
  border-radius: 50%;
  margin-top: 10px;
  align-items: center;
}

.name{
  font-size: 20px;
  font-weight: bold;
 
}

.provesi{
  font-size: 18px;
  margin-top: -20px;
}

nav  {
  display: flex;
  flex-direction: column;
  cursor: pointer;
  
}
nav a.router-link-active {
 
  color: #586f82;
  
}
 nav:hover{
  color: rgb(198, 198, 217)
  
}

.footer{
  font-size: 16px;
  font-style: italic;
}

.konten{
  width: 1100px;
  height: auto;
}

</style>
