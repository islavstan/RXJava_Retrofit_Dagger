package com.islavstan.myrxdaggerapp.deps;


import com.islavstan.myrxdaggerapp.MainActivity;
import com.islavstan.myrxdaggerapp.networking.NetworkModule;



import dagger.Component;


/*Компонент - это посредник между Activity и модулем. Когда Activity нужен какой-либо объект,
        она сообщает об этом компоненту. Компонент знает, какой модуль умеет создавать такой объект,
        просит модуль создать объект и передает его в Activity. При этом компонент может использовать другие модули,
        чтобы создать всю иерархию объектов, необходимую для создания искомого объекта.*/



@Component(modules = {NetworkModule.class})
public interface Deps {
    void inject(MainActivity homeActivity);
}
