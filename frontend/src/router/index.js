
import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from "@/components/HelloWorld.vue";

Vue.use(Router)

export default new Router({
    mode: 'history',
    routes: [
        {
            path: '/',  // 루트를 제외한 나머지 path를
            name: 'Main',
            component: HelloWorld
        },
        {
            path: '/web/hello',  // 구분을 위한 sub path로 앞을 맞춰줍니다.
            name: 'HelloWorld',
            component: HelloWorld
        }
    ]
})