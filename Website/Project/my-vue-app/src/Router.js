import { createRouter, createWebHistory } from "vue-router";
import HalamanApp from "./components/HalamanApp.vue";
import About from "./components/About.vue";


const routes = [
    { path: '/', component: HalamanApp },
    { path: '/about', component: About }
];

const router = createRouter({
    history: createWebHistory(),
    routes
  });

  export default router;