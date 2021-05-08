
import { Step, Table, BeforeSuite, AfterSuite } from "gauge-ts";
import { strictEqual } from 'assert';
import {
    checkBox,
    click,
    closeBrowser,
    evaluate,
    goto,
    into,
    link,
    openBrowser,
    press,
    screenshot,
    text,
    textBox,
    toLeftOf,
    write
} from 'taiko';
import assert = require("assert");

export default class StepImplementation {
    @BeforeSuite()
    public async beforeSuite() {
        await openBrowser({ headless: true, args: ['--no-sandbox', '--disable-setuid-sandbox'] });
    }

    @AfterSuite()
    public async afterSuite() {
        await closeBrowser();
    };

    @Step("ページを開く")
    public async openPage() {
        await goto("https://bigro.github.io/html-sandbox/");
        await screenshot();
    }

}
