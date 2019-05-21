import { RouterModule } from '@angular/router';

import { LoginPageComponent } from './login-page/login-page.component';
import { MainPageComponent} from './main-page/main-page.component';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';
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

export const appRoutes = [

    {
        path: '',
        redirectTo: 'login',
        pathMatch: 'full'
    },
    {
        path: 'login',
        component: LoginPageComponent
    },
    {
        path: 'welcome',
        component: WelcomePageComponent
    },
    {
        path: 'main',
        component: MainPageComponent,
        children: [
            {
                path: '',
                component: DefaultDisplayComponent
            },
            {
                path: 'userManagement',
                component: UserManagementComponent
            },
            {
                path: 'uploadManagement',
                component: UploadManagementComponent
            },
            {
                path: 'chainManagement',
                component: ChainManagementComponent
            },
            {
                path: 'experimentCrud',
                component: ExperimentCrudComponent
            },
            {
                path: 'experimentGather',
                component: ExperimentRepotGatherComponent
            },
            {
                path: 'className',
                component: ClassNameComponent
            },
            {
                path: 'experimentName',
                component: ExperimentNameComponent
            },
            {
                path: 'type',
                component: TypeComponent
            },
            {
                path: 'instructorManagement',
                component: InstructorManagementComponent
            },
            {
                path: 'baseMsg',
                component: BaseMsgComponent
            },
            {
                path: 'numericalStatement',
                component: NumericalStatementComponent
            },
            {
                path: 'chartDisplay',
                component: ChartDisplayComponent
            }
        ]
    },
    {
        path: '**',
        component: MainPageComponent
    }
];
