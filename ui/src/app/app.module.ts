import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule} from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FileSelectDirective } from 'ng2-file-upload';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatVideoModule } from 'mat-video';

import { AppComponent } from './app.component';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';
import { MainPageComponent } from './main-page/main-page.component';
import { appRoutes } from './app.routes';
import { UserManagementComponent } from './main-page/user-management/user-management.component';
import { UploadManagementComponent } from './main-page/upload-management/upload-management.component';
import { ChainManagementComponent } from './main-page/chain-management/chain-management.component';
import { ExperimentCrudComponent } from './main-page/experiment-crud/experiment-crud.component';
import { ExperimentRepotGatherComponent } from './main-page/experiment-repot-gather/experiment-repot-gather.component';
import { ClassNameComponent } from './main-page/class-name/class-name.component';
import { ExperimentNameComponent } from './main-page/experiment-name/experiment-name.component';
import { TypeComponent } from './main-page/type/type.component';
import { InstructorManagementComponent } from './main-page/instructor-management/instructor-management.component';
import { BaseMsgComponent } from './main-page/base-msg/base-msg.component';
import { NumericalStatementComponent } from './main-page/numerical-statement/numerical-statement.component';
import { ChartDisplayComponent } from './main-page/chart-display/chart-display.component';
import { DefaultDisplayComponent } from './main-page/default-display/default-display.component';
import { LoginPageComponent } from './login-page/login-page.component';

@NgModule({
  declarations: [
    AppComponent,
    WelcomePageComponent,
    MainPageComponent,
    WelcomePageComponent,
    UserManagementComponent,
    UploadManagementComponent,
    ChainManagementComponent,
    ExperimentCrudComponent,
    ExperimentRepotGatherComponent,
    ClassNameComponent,
    ExperimentNameComponent,
    TypeComponent,
    InstructorManagementComponent,
    BaseMsgComponent,
    NumericalStatementComponent,
    ChartDisplayComponent,
    DefaultDisplayComponent,
    LoginPageComponent,
    FileSelectDirective
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    MatVideoModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
