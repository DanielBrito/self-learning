import Vue from 'vue'
import App from './App.vue'
import VeeValidate from 'vee-validate'; /* Validation plugin */
import router from './router';

Vue.use(VeeValidate);
Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
