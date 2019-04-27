import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { WelcomePageComponentComponent } from './welcome-page-component/welcome-page-component.component';
import { MainPageComponent } from './main-page/main-page.component';
import { appRoutes } from './app.routes';

@NgModule({
  declarations: [
    AppComponent,
    WelcomePageComponentComponent,
    MainPageComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
