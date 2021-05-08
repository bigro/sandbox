
import { Step, Table, BeforeSuite, AfterSuite } from "gauge-ts";
import { strictEqual } from 'assert';
import {
    checkBox,
    click,
    closeBrowser,
    evaluate, focus,
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
    }

    @Step("フォームに入力する")
    public async writeForm() {
        await focus(textBox('Email address'));
        await write('aaaa');
        await screenshot();    }

}
