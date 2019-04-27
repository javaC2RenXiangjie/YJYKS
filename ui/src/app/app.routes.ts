import { RouterModule } from '@angular/router';

import { MainPageComponent} from './main-page/main-page.component';
import { WelcomePageComponentComponent } from './welcome-page-component/welcome-page-component.component';

export const appRoutes = [

    {
        path: '',
        redirectTo: 'welcome',
        pathMatch: 'full'
    },
    {
        path: 'welcome',
        component: WelcomePageComponentComponent
    },
    {
        path: 'main',
        component: MainPageComponent
    },
    {
        path: '**',
        component: WelcomePageComponentComponent
    }
];
